package com.flieger.payment.commands.impl;

import de.hybris.platform.payment.commands.StandaloneRefundCommand;
import de.hybris.platform.payment.commands.request.StandaloneRefundRequest;
import de.hybris.platform.payment.commands.result.RefundResult;
import de.hybris.platform.payment.dto.TransactionStatus;
import de.hybris.platform.payment.dto.TransactionStatusDetails;
import java.util.Date;

public class MundipaggStandaloneRefundCommand extends MundipaggGenericCommand
		implements StandaloneRefundCommand<StandaloneRefundRequest>
{

	public RefundResult perform(StandaloneRefundRequest request)
	{
		RefundResult result = new RefundResult();

		result.setCurrency(request.getCurrency());
		result.setTotalAmount(request.getTotalAmount());
		result.setRequestTime(new Date());

		result.setTransactionStatus(TransactionStatus.ACCEPTED);
		result.setTransactionStatusDetails(TransactionStatusDetails.SUCCESFULL);

		genericPerform(request, result);

		return result;
	}
}
