package com.flieger.payment.commands.impl;

import de.hybris.platform.payment.AdapterException;
import de.hybris.platform.payment.commands.factory.CommandFactory;
import de.hybris.platform.payment.commands.factory.CommandFactoryRegistry;
import de.hybris.platform.payment.dto.BasicCardInfo;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MundipaggCommandFactoryRegistryImpl
		implements ApplicationContextAware, CommandFactoryRegistry
{

	public static final String MOCKUP_PAYMENT_PROVIDER = "Mundipagg";
	private ApplicationContext applicationContext;

	@Override
	public CommandFactory getFactory(String paymentProvider)
			throws AdapterException
	{
		if ("Mockup".equals(paymentProvider))
		{
			return (CommandFactory) this.applicationContext.getBean("mockupCommandFactory", CommandFactory.class);
		}

		throw new AdapterException("The requested paymentProvider should be <Mockup> instead of <"
				+ paymentProvider + ">");
	}

	@Override
	public CommandFactory getFactory(BasicCardInfo card, boolean threeD)
			throws AdapterException
	{
		return (CommandFactory) this.applicationContext.getBean("mockupCommandFactory", CommandFactory.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException
	{
		this.applicationContext = applicationContext;
	}
}
