package de.fliegersoftware.amazon.payment.services.impl;

import de.hybris.platform.commerceservices.order.impl.DefaultCommerceCheckoutService;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.core.model.order.payment.PaymentInfoModel;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.model.PaymentTransactionEntryModel;
import de.hybris.platform.payment.model.PaymentTransactionModel;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Currency;

import org.apache.commons.lang.StringUtils;

import de.fliegersoftware.amazon.core.model.AmazonPaymentInfoModel;
import de.fliegersoftware.amazon.payment.services.AmazonCommerceCheckoutService;
import de.fliegersoftware.amazon.payment.services.AmazonPaymentService;

/**
 * @author taylor.savegnago
 *
 */
public class DefaultAmazonCommerceCheckoutService extends DefaultCommerceCheckoutService implements AmazonCommerceCheckoutService
{
	
	@Override
	public PaymentTransactionEntryModel authorizeAmazonPayment(CartModel cartModel, 
			String paymentProvider) {
		ServicesUtil.validateParameterNotNull(cartModel,
				"Cart model cannot be null");
		ServicesUtil.validateParameterNotNull(cartModel.getPaymentInfo(),
				"Payment information on cart cannot be null");

		Double totalPrice = cartModel.getTotalPrice();

		Double totalTax = ((cartModel.getNet().booleanValue())
				&& (cartModel.getStore() != null) && (cartModel.getStore()
				.getExternalTaxEnabled().booleanValue())) ? cartModel
				.getTotalTax() : Double.valueOf(0.0D);

		BigDecimal totalPriceWithoutTaxBD = new BigDecimal(
				(totalPrice == null) ? 0.0D : totalPrice.doubleValue())
				.setScale(2, RoundingMode.HALF_EVEN);

		BigDecimal totalPriceBD = new BigDecimal((totalTax == null) ? 0.0D
				: totalTax.doubleValue()).setScale(2, RoundingMode.HALF_EVEN)
				.add(totalPriceWithoutTaxBD);

		return authorizeAmazonPaymentAmount(cartModel, paymentProvider, totalPriceBD);
	}
	
	@Override
	public PaymentTransactionEntryModel authorizeAmazonPaymentAmount(final CartModel cartModel,
			final String paymentProvider,
			final BigDecimal amount) {
		PaymentTransactionEntryModel transactionEntryModel = null;
		PaymentInfoModel paymentInfo = cartModel.getPaymentInfo();
		if ((paymentInfo instanceof AmazonPaymentInfoModel) && (StringUtils.isNotBlank(((AmazonPaymentInfoModel) paymentInfo).getToken()))) {
			Currency currency = getI18nService().getBestMatchingJavaCurrency(cartModel.getCurrency().getIsocode());
			String merchantTransactionCode = getGenerateMerchantTransactionCodeStrategy().generateCode(cartModel);
			
			transactionEntryModel = getPaymentService().authorize(merchantTransactionCode, amount, currency, 
					((AmazonPaymentInfoModel) paymentInfo).getToken(), 
					paymentProvider);
			if (transactionEntryModel != null) {
				PaymentTransactionModel paymentTransaction = transactionEntryModel
						.getPaymentTransaction();

				if ((TransactionStatus.ACCEPTED.name()
						.equals(transactionEntryModel.getTransactionStatus()))
						|| (TransactionStatus.REVIEW.name()
								.equals(transactionEntryModel
										.getTransactionStatus()))) {
					paymentTransaction.setOrder(cartModel);
					getModelService().saveAll(
							new Object[] { cartModel, paymentTransaction });
				} else {
					getModelService().removeAll(
							Arrays.asList(new ItemModel[] { paymentTransaction,
									transactionEntryModel }));
				}
			}
		}
		return transactionEntryModel;
	}
	
	/* (non-Javadoc)
	 * @see de.hybris.platform.commerceservices.order.impl.DefaultCommerceCheckoutService#getPaymentService()
	 */
	@Override
	protected AmazonPaymentService getPaymentService()
	{
		return (AmazonPaymentService)super.getPaymentService();
	}

}