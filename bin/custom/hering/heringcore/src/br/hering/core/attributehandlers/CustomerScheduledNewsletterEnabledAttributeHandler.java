package br.hering.core.attributehandlers;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import com.fliegersoftware.newslettersubscription.enums.SubscriptionType;
import com.fliegersoftware.newslettersubscription.exceptions.DuplicatedNewsletterSubscriptionException;
import com.fliegersoftware.newslettersubscription.exceptions.NewsletterSubscriptionNotFound;
import com.fliegersoftware.newslettersubscription.model.NewsletterSubscriptionModel;
import com.fliegersoftware.newslettersubscription.services.NewsletterSubscriptionService;

import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.store.services.BaseStoreService;


public class CustomerScheduledNewsletterEnabledAttributeHandler implements DynamicAttributeHandler<Boolean, CustomerModel> {

	
	private NewsletterSubscriptionService newsletterSubscriptionService;
	
	private BaseStoreService baseStoreService;
	
	private UserService userService;

	private CustomerNameStrategy customerNameStrategy;

	
	@Override
	public Boolean get(CustomerModel customerModel) {
		
		Collection<NewsletterSubscriptionModel> customerSubscriptions = customerModel.getNewsletterSubscriptions();
		
		if (CollectionUtils.isNotEmpty(customerSubscriptions))				
		{
			for (NewsletterSubscriptionModel subscription : customerSubscriptions)
			{
				SubscriptionType type = subscription.getSubscriptionType();
				if (type == SubscriptionType.SCHEDULED_NEWSLETTER)
				{
					return true;
				}
			}
		}

		return false;
		
	}

	@Override
	public void set(CustomerModel customerModel, Boolean scheduledNewsletterEnabled) {
		
		NewsletterSubscriptionModel subscription = new NewsletterSubscriptionModel();
		
		final String[] names = customerNameStrategy.splitName(customerModel.getName());
		
		subscription.setFirstName(names[0]);
		subscription.setLastName(names[1]);
		subscription.setEmail(customerModel.getUid());
		subscription.setGender(customerModel.getGender());
		TitleModel title = getUserService().getTitleForCode("mr");
		subscription.setTitle(title);
		subscription.setLanguage(customerModel.getSessionLanguage());
		subscription.setStore(getBaseStoreService().getCurrentBaseStore());		
		final SubscriptionType subscriptionType = SubscriptionType.SCHEDULED_NEWSLETTER;
		subscription.setSubscriptionType(subscriptionType);
		subscription.setCustomer(customerModel);
							
		if (scheduledNewsletterEnabled)
		{	
			try 
			{
				getNewsletterSubscriptionService().subscribe(subscription);
			} 
			catch (DuplicatedNewsletterSubscriptionException e) 
			{
				//e.printStackTrace();
			}
		}
		else
		{
			try 
			{
				getNewsletterSubscriptionService().unsubscribe(subscription);
			} 
			catch (NewsletterSubscriptionNotFound e) 
			{
				//e.printStackTrace();
			}
		}
		
	}
	
	
	public BaseStoreService getBaseStoreService() {
		return baseStoreService;
	}

	@Required
	public void setBaseStoreService(BaseStoreService baseStoreService) {
		this.baseStoreService = baseStoreService;
	}
	
	public CustomerNameStrategy getCustomerNameStrategy() {
		return customerNameStrategy;
	}

	@Required
	public void setCustomerNameStrategy(CustomerNameStrategy customerNameStrategy) {
		this.customerNameStrategy = customerNameStrategy;
	}
	
	public UserService getUserService() {
		return userService;
	}

	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public NewsletterSubscriptionService getNewsletterSubscriptionService() {
		return newsletterSubscriptionService;
	}

	@Required
	public void setNewsletterSubscriptionService(NewsletterSubscriptionService newsletterSubscriptionService) {
		this.newsletterSubscriptionService = newsletterSubscriptionService;
	}

	
}