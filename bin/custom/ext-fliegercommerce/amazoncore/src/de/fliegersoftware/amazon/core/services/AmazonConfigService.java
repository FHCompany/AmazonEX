package de.fliegersoftware.amazon.core.services;

import java.util.Properties;

import de.fliegersoftware.amazon.core.enums.AuthorizationModeEnum;
import de.fliegersoftware.amazon.core.enums.CaptureModeEnum;

public interface AmazonConfigService {

	public static final String ACCESS_KEY_ID = "accessKeyId";
	public static final String CURRENCY = "currency";
	public static final String SECRET_ACCESS_KEY = "secretAccessKey";
	public static final String APPLICATION_NAME = "applicationName";
	public static final String APPLICATION_VERSION = "applicationVersion";
	public static final String SELLER_ID = "sellerId";
	public static final String ENVIRONMENT = "environment";
	public static final String REGION = "region";
	public static final String PLACE_ORDER_URL = "placeOrderUrl";
	public static final String CERT_CN = "certCN";

	Properties getAmazonProperties();
	String getClientId();
	String getSellerId();
	String getRegion();
	boolean isSandboxMode();
	int getAddressWidgetWidth();
	int getAddressWidgetHeight();
	String getLoginButtonColor();
	String getLoginButtonSize();
	String getPayButtonColor();
	String getPayButtonSize();
	int getPaymentWidgetWidth();
	int getPaymentWidgetHeight();
	AuthorizationModeEnum getAuthorizationMode();
	CaptureModeEnum getCaptureMode();
}
