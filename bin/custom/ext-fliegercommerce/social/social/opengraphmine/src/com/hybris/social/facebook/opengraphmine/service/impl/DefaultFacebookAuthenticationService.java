/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 * 
 */
package com.hybris.social.facebook.opengraphmine.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.internal.service.AbstractBusinessService;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.social.connect.Connection;
import org.springframework.social.facebook.api.Facebook;

import com.google.common.base.Preconditions;
import com.hybris.social.facebook.common.model.FacebookApplicationModel;
import com.hybris.social.facebook.common.service.FacebookApplicationService;
import com.hybris.social.facebook.opengraphmine.model.FacebookUserModel;
import com.hybris.social.facebook.opengraphmine.service.FacebookAuthenticationService;
import com.hybris.social.facebook.opengraphmine.service.FacebookEventService;
import com.hybris.social.facebook.opengraphmine.service.dao.FacebookUserDao;
import com.hybris.social.facebook.opengraphmine.service.exception.FacebookServiceException;


/**
 * @author rmcotton
 * 
 */
public class DefaultFacebookAuthenticationService extends AbstractBusinessService implements FacebookAuthenticationService
{
	protected static final String FB_USER_KEY = "FB_USER";
	protected static final String FB_AUTOLOGIN_USER = "FB_AUTOLOGIN_CUSTOMER";

	protected static final String FB_CONNECTION = "FB_CONNECTION";

	private static final Logger LOG = Logger.getLogger(DefaultFacebookAuthenticationService.class);

	private FacebookApplicationService facebookApplicationService;
	private FacebookUserDao facebookUserDao;
	private UserService userService;
	private FacebookEventService facebookEventService;

	private Converter<Connection<Facebook>, FacebookUserModel> facebookProfileConverter;


	protected void setCurrentFacebookUser(final FacebookUserModel facebookUser)
	{
		getSessionService().setAttribute(FB_USER_KEY, facebookUser);
	}

	@Override
	public FacebookUserModel getCurrentFacebookUser()
	{
		return getSessionService().getAttribute(FB_USER_KEY);
	}

	@Override
	public void setAutoLoginUser(final UserModel user)
	{
		if (user == null)
		{
			getSessionService().setAttribute(FB_AUTOLOGIN_USER, null);
		}
		else
		{
			Preconditions.checkNotNull(getCurrentFacebookUser(), "You cannot auto-login a user without a current facebook user set");
			Preconditions.checkNotNull(getCurrentFacebookUser().getLinkedCustomer(),
					"The current facebook user has not been linked to a customer");
			Preconditions.checkArgument(getCurrentFacebookUser().getLinkedCustomer().equals(user),
					"The current facebook user is not linked to the auto-logged in user");
			getSessionService().setAttribute(FB_AUTOLOGIN_USER, user);
		}
	}

	@Override
	public UserModel getAutoLoginUser()
	{
		return getSessionService().getAttribute(FB_AUTOLOGIN_USER);
	}

	@Override
	public Set<FacebookUserModel> getAllAssociatedFacebookUsers()
	{
		// crestes new set of facebook users
		final Set<FacebookUserModel> users = new HashSet<FacebookUserModel>();
		// if facebook user connected
		if (getCurrentFacebookUser() != null)
		{
			users.add(getCurrentFacebookUser());
			// all his/ her friends
			users.addAll(getFacebookUserDao().getFriendFacebookUsers(getCurrentFacebookUser()));
		}

		return users;
	}

	protected FacebookUserModel getFacebookUserForConnection(final Connection<Facebook> connection)
	{
		FacebookUserModel facebookUser;
		try
		{
			facebookUser = getFacebookUserDao().findFacebookUserById(connection.getKey().getProviderUserId());
			getFacebookProfileConverter().convert(connection, facebookUser);
			getModelService().save(facebookUser);

		}
		catch (final ModelNotFoundException e)
		{
			return null;
		}
		return facebookUser;
	}

	@Override
	public FacebookUserModel getOrCreateFacebookUserForConnection(final Connection<Facebook> connection)
	{
		FacebookUserModel facebookUser = getFacebookUserForConnection(connection);
		if (facebookUser == null)
		{
			facebookUser = createFacebookUserFromConnection(connection);
		}

		return facebookUser;
	}

	protected FacebookUserModel createFacebookUserFromConnection(final Connection<Facebook> connection)
	{
		return createFacebookUserFromConnection(connection, true);
	}


	protected FacebookUserModel createFacebookUserFromConnection(final Connection<Facebook> connection, final boolean sync)
	{
		final FacebookUserModel facebookUser = getFacebookProfileConverter().convert(connection);
		getModelService().save(facebookUser);
		if (sync)
		{
			final FacebookApplicationModel currentApp = facebookApplicationService.getCurrentApplication();
			getFacebookEventService().syncProfile(connection, currentApp, facebookUser, true);
		}

		return facebookUser;

	}

	@Override
	public void authenticateHybrisUser(Connection<Facebook> connection) throws FacebookServiceException
	{
		if (connection == null)
		{
			connection = getCurrentConnection();
		}
		if (connection != null && connection.test())
		{
			setCurrentConnection(connection);
			FacebookUserModel facebookUser = getFacebookUserForConnection(connection);
			if (facebookUser == null)
			{
				facebookUser = createFacebookUserFromConnection(connection, false);
			}
			setCurrentFacebookUser(facebookUser);
			linkCurrentFacebookUserWithCurrentUser(false);


			// publish an async profile sync request
			final FacebookApplicationModel currentApp = facebookApplicationService.getCurrentApplication();

			getFacebookEventService().syncProfile(connection, currentApp, getCurrentFacebookUser(), false);
		}
		else
		{
			logout();
			throw new FacebookServiceException("not authenticated");
		}
	}

	@Override
	public void logout()
	{
		setCurrentConnection(null);
		setCurrentFacebookUser(null);
		setAutoLoginUser(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.social.facebook.service.FacebookAuthenticationService#getLinkedFacebookUserForCustomer(de.hybris
	 * .platform.core.model.user.CustomerModel)
	 */
	@Override
	public Set<FacebookUserModel> getLinkedFacebookUsersForCustomer(final CustomerModel customer)
	{
		if (getUserService().isAnonymousUser(customer))
		{
			return Collections.emptySet();
		}
		return getFacebookUserDao().findFacebookUsersLinkedToCustomer(customer);
	}

	protected boolean linkCurrentFacebookUserWithCurrentUser(final boolean resync)
	{
		final FacebookUserModel currentFacebookUser = getCurrentFacebookUser();
		if (currentFacebookUser == null)
		{
			return false;
		}
		final UserModel currentUser = getUserService().getCurrentUser();
		if (getUserService().isAnonymousUser(currentUser))
		{
			return false;
		}
		if (currentUser instanceof CustomerModel)
		{
			if (currentFacebookUser.getLinkedCustomer() != currentUser)
			{
				currentFacebookUser.setLinkedCustomer((CustomerModel) currentUser);
				getModelService().save(currentFacebookUser);

				// force a profile resync. This will result in facebook specific segments being transfered to the new user account.
				if (resync)
				{
					// publish an async profile sync request
					final FacebookApplicationModel currentApp = facebookApplicationService.getCurrentApplication();
					getFacebookEventService().syncProfile(getCurrentConnection(), currentApp, getCurrentFacebookUser(), true);
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean linkCurrentFacebookUserWithCurrentUser()
	{
		return linkCurrentFacebookUserWithCurrentUser(true);
	}

	/**
	 * @param facebookUserDao
	 *           the facebookUserDao to set
	 */
	@Required
	public void setFacebookUserDao(final FacebookUserDao facebookUserDao)
	{
		this.facebookUserDao = facebookUserDao;
	}


	/**
	 * @return the facebookUserDao
	 */
	protected FacebookUserDao getFacebookUserDao()
	{
		return facebookUserDao;
	}

	@Required
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	public UserService getUserService()
	{
		return this.userService;
	}


	public FacebookApplicationService getFacebookApplicationService()
	{
		return facebookApplicationService;
	}

	@Required
	public void setFacebookApplicationService(final FacebookApplicationService facebookApplicationService)
	{
		this.facebookApplicationService = facebookApplicationService;
	}

	@Required
	public void setFacebookProfileConverter(final Converter<Connection<Facebook>, FacebookUserModel> facebookProfileConverter)
	{
		this.facebookProfileConverter = facebookProfileConverter;
	}

	public Converter<Connection<Facebook>, FacebookUserModel> getFacebookProfileConverter()
	{
		return this.facebookProfileConverter;
	}


	@Override
	public void setCurrentConnection(final Connection<Facebook> connection)
	{
		getSessionService().setAttribute(FB_CONNECTION, connection);
	}

	@Override
	public Connection<Facebook> getCurrentConnection()
	{
		return getSessionService().getAttribute(FB_CONNECTION);
	}

	public FacebookEventService getFacebookEventService()
	{
		return facebookEventService;
	}

	@Required
	public void setFacebookEventService(final FacebookEventService facebookEventService)
	{
		this.facebookEventService = facebookEventService;
	}



}
