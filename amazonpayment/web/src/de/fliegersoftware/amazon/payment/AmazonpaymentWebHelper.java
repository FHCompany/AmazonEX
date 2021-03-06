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
package de.fliegersoftware.amazon.payment;

import org.slf4j.Logger;  import org.slf4j.LoggerFactory;


/**
 * Simple test class to demonstrate how to include utility classes to your webmodule.
 */
public class AmazonpaymentWebHelper
{
	/** Edit the local|project.properties to change logging behavior (properties log4j.*). */
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(AmazonpaymentWebHelper.class.getName());

	public static final String getTestOutput()
	{
		return "testoutput";
	}
}
