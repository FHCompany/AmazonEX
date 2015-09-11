/**
 * PaymentRequest3D.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adyen.services.payment;

public class PaymentRequest3D  implements java.io.Serializable {
    private com.adyen.services.common.Amount additionalAmount;

    private com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData;

    private com.adyen.services.common.Amount amount;

    private com.adyen.services.common.Address billingAddress;

    private com.adyen.services.common.BrowserInfo browserInfo;

    private com.adyen.services.payment.ForexQuote dccQuote;

    private com.adyen.services.common.Address deliveryAddress;

    private java.util.Calendar deliveryDate;

    private java.lang.String deviceFingerprint;

    private java.lang.Integer fraudOffset;

    private com.adyen.services.common.Installments installments;

    private java.lang.String md;

    private java.lang.String merchantAccount;

    private java.lang.String orderReference;

    private java.lang.String paResponse;

    private java.lang.String persistentCookie;

    private com.adyen.services.payment.Recurring recurring;

    private java.lang.String reference;

    private java.lang.String referrer;

    private java.lang.String selectedBrand;

    private java.lang.String selectedRecurringDetailReference;

    private java.lang.String sessionId;

    private java.lang.String shopperEmail;

    private java.lang.String shopperIP;

    private java.lang.String shopperInteraction;

    private java.lang.String shopperLocale;

    private com.adyen.services.common.Name shopperName;

    private java.lang.String shopperReference;

    private java.lang.String shopperStatement;

    private java.lang.String skinCode;

    private java.lang.String socialSecurityNumber;

    public PaymentRequest3D() {
    }

    public PaymentRequest3D(
           com.adyen.services.common.Amount additionalAmount,
           com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData,
           com.adyen.services.common.Amount amount,
           com.adyen.services.common.Address billingAddress,
           com.adyen.services.common.BrowserInfo browserInfo,
           com.adyen.services.payment.ForexQuote dccQuote,
           com.adyen.services.common.Address deliveryAddress,
           java.util.Calendar deliveryDate,
           java.lang.String deviceFingerprint,
           java.lang.Integer fraudOffset,
           com.adyen.services.common.Installments installments,
           java.lang.String md,
           java.lang.String merchantAccount,
           java.lang.String orderReference,
           java.lang.String paResponse,
           java.lang.String persistentCookie,
           com.adyen.services.payment.Recurring recurring,
           java.lang.String reference,
           java.lang.String referrer,
           java.lang.String selectedBrand,
           java.lang.String selectedRecurringDetailReference,
           java.lang.String sessionId,
           java.lang.String shopperEmail,
           java.lang.String shopperIP,
           java.lang.String shopperInteraction,
           java.lang.String shopperLocale,
           com.adyen.services.common.Name shopperName,
           java.lang.String shopperReference,
           java.lang.String shopperStatement,
           java.lang.String skinCode,
           java.lang.String socialSecurityNumber) {
           this.additionalAmount = additionalAmount;
           this.additionalData = additionalData;
           this.amount = amount;
           this.billingAddress = billingAddress;
           this.browserInfo = browserInfo;
           this.dccQuote = dccQuote;
           this.deliveryAddress = deliveryAddress;
           this.deliveryDate = deliveryDate;
           this.deviceFingerprint = deviceFingerprint;
           this.fraudOffset = fraudOffset;
           this.installments = installments;
           this.md = md;
           this.merchantAccount = merchantAccount;
           this.orderReference = orderReference;
           this.paResponse = paResponse;
           this.persistentCookie = persistentCookie;
           this.recurring = recurring;
           this.reference = reference;
           this.referrer = referrer;
           this.selectedBrand = selectedBrand;
           this.selectedRecurringDetailReference = selectedRecurringDetailReference;
           this.sessionId = sessionId;
           this.shopperEmail = shopperEmail;
           this.shopperIP = shopperIP;
           this.shopperInteraction = shopperInteraction;
           this.shopperLocale = shopperLocale;
           this.shopperName = shopperName;
           this.shopperReference = shopperReference;
           this.shopperStatement = shopperStatement;
           this.skinCode = skinCode;
           this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the additionalAmount value for this PaymentRequest3D.
     * 
     * @return additionalAmount
     */
    public com.adyen.services.common.Amount getAdditionalAmount() {
        return additionalAmount;
    }


    /**
     * Sets the additionalAmount value for this PaymentRequest3D.
     * 
     * @param additionalAmount
     */
    public void setAdditionalAmount(com.adyen.services.common.Amount additionalAmount) {
        this.additionalAmount = additionalAmount;
    }


    /**
     * Gets the additionalData value for this PaymentRequest3D.
     * 
     * @return additionalData
     */
    public com.adyen.services.payment.AnyType2AnyTypeMapEntry[] getAdditionalData() {
        return additionalData;
    }


    /**
     * Sets the additionalData value for this PaymentRequest3D.
     * 
     * @param additionalData
     */
    public void setAdditionalData(com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData) {
        this.additionalData = additionalData;
    }


    /**
     * Gets the amount value for this PaymentRequest3D.
     * 
     * @return amount
     */
    public com.adyen.services.common.Amount getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentRequest3D.
     * 
     * @param amount
     */
    public void setAmount(com.adyen.services.common.Amount amount) {
        this.amount = amount;
    }


    /**
     * Gets the billingAddress value for this PaymentRequest3D.
     * 
     * @return billingAddress
     */
    public com.adyen.services.common.Address getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this PaymentRequest3D.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(com.adyen.services.common.Address billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the browserInfo value for this PaymentRequest3D.
     * 
     * @return browserInfo
     */
    public com.adyen.services.common.BrowserInfo getBrowserInfo() {
        return browserInfo;
    }


    /**
     * Sets the browserInfo value for this PaymentRequest3D.
     * 
     * @param browserInfo
     */
    public void setBrowserInfo(com.adyen.services.common.BrowserInfo browserInfo) {
        this.browserInfo = browserInfo;
    }


    /**
     * Gets the dccQuote value for this PaymentRequest3D.
     * 
     * @return dccQuote
     */
    public com.adyen.services.payment.ForexQuote getDccQuote() {
        return dccQuote;
    }


    /**
     * Sets the dccQuote value for this PaymentRequest3D.
     * 
     * @param dccQuote
     */
    public void setDccQuote(com.adyen.services.payment.ForexQuote dccQuote) {
        this.dccQuote = dccQuote;
    }


    /**
     * Gets the deliveryAddress value for this PaymentRequest3D.
     * 
     * @return deliveryAddress
     */
    public com.adyen.services.common.Address getDeliveryAddress() {
        return deliveryAddress;
    }


    /**
     * Sets the deliveryAddress value for this PaymentRequest3D.
     * 
     * @param deliveryAddress
     */
    public void setDeliveryAddress(com.adyen.services.common.Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    /**
     * Gets the deliveryDate value for this PaymentRequest3D.
     * 
     * @return deliveryDate
     */
    public java.util.Calendar getDeliveryDate() {
        return deliveryDate;
    }


    /**
     * Sets the deliveryDate value for this PaymentRequest3D.
     * 
     * @param deliveryDate
     */
    public void setDeliveryDate(java.util.Calendar deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    /**
     * Gets the deviceFingerprint value for this PaymentRequest3D.
     * 
     * @return deviceFingerprint
     */
    public java.lang.String getDeviceFingerprint() {
        return deviceFingerprint;
    }


    /**
     * Sets the deviceFingerprint value for this PaymentRequest3D.
     * 
     * @param deviceFingerprint
     */
    public void setDeviceFingerprint(java.lang.String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
    }


    /**
     * Gets the fraudOffset value for this PaymentRequest3D.
     * 
     * @return fraudOffset
     */
    public java.lang.Integer getFraudOffset() {
        return fraudOffset;
    }


    /**
     * Sets the fraudOffset value for this PaymentRequest3D.
     * 
     * @param fraudOffset
     */
    public void setFraudOffset(java.lang.Integer fraudOffset) {
        this.fraudOffset = fraudOffset;
    }


    /**
     * Gets the installments value for this PaymentRequest3D.
     * 
     * @return installments
     */
    public com.adyen.services.common.Installments getInstallments() {
        return installments;
    }


    /**
     * Sets the installments value for this PaymentRequest3D.
     * 
     * @param installments
     */
    public void setInstallments(com.adyen.services.common.Installments installments) {
        this.installments = installments;
    }


    /**
     * Gets the md value for this PaymentRequest3D.
     * 
     * @return md
     */
    public java.lang.String getMd() {
        return md;
    }


    /**
     * Sets the md value for this PaymentRequest3D.
     * 
     * @param md
     */
    public void setMd(java.lang.String md) {
        this.md = md;
    }


    /**
     * Gets the merchantAccount value for this PaymentRequest3D.
     * 
     * @return merchantAccount
     */
    public java.lang.String getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this PaymentRequest3D.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(java.lang.String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the orderReference value for this PaymentRequest3D.
     * 
     * @return orderReference
     */
    public java.lang.String getOrderReference() {
        return orderReference;
    }


    /**
     * Sets the orderReference value for this PaymentRequest3D.
     * 
     * @param orderReference
     */
    public void setOrderReference(java.lang.String orderReference) {
        this.orderReference = orderReference;
    }


    /**
     * Gets the paResponse value for this PaymentRequest3D.
     * 
     * @return paResponse
     */
    public java.lang.String getPaResponse() {
        return paResponse;
    }


    /**
     * Sets the paResponse value for this PaymentRequest3D.
     * 
     * @param paResponse
     */
    public void setPaResponse(java.lang.String paResponse) {
        this.paResponse = paResponse;
    }


    /**
     * Gets the persistentCookie value for this PaymentRequest3D.
     * 
     * @return persistentCookie
     */
    public java.lang.String getPersistentCookie() {
        return persistentCookie;
    }


    /**
     * Sets the persistentCookie value for this PaymentRequest3D.
     * 
     * @param persistentCookie
     */
    public void setPersistentCookie(java.lang.String persistentCookie) {
        this.persistentCookie = persistentCookie;
    }


    /**
     * Gets the recurring value for this PaymentRequest3D.
     * 
     * @return recurring
     */
    public com.adyen.services.payment.Recurring getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this PaymentRequest3D.
     * 
     * @param recurring
     */
    public void setRecurring(com.adyen.services.payment.Recurring recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the reference value for this PaymentRequest3D.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this PaymentRequest3D.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the referrer value for this PaymentRequest3D.
     * 
     * @return referrer
     */
    public java.lang.String getReferrer() {
        return referrer;
    }


    /**
     * Sets the referrer value for this PaymentRequest3D.
     * 
     * @param referrer
     */
    public void setReferrer(java.lang.String referrer) {
        this.referrer = referrer;
    }


    /**
     * Gets the selectedBrand value for this PaymentRequest3D.
     * 
     * @return selectedBrand
     */
    public java.lang.String getSelectedBrand() {
        return selectedBrand;
    }


    /**
     * Sets the selectedBrand value for this PaymentRequest3D.
     * 
     * @param selectedBrand
     */
    public void setSelectedBrand(java.lang.String selectedBrand) {
        this.selectedBrand = selectedBrand;
    }


    /**
     * Gets the selectedRecurringDetailReference value for this PaymentRequest3D.
     * 
     * @return selectedRecurringDetailReference
     */
    public java.lang.String getSelectedRecurringDetailReference() {
        return selectedRecurringDetailReference;
    }


    /**
     * Sets the selectedRecurringDetailReference value for this PaymentRequest3D.
     * 
     * @param selectedRecurringDetailReference
     */
    public void setSelectedRecurringDetailReference(java.lang.String selectedRecurringDetailReference) {
        this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    }


    /**
     * Gets the sessionId value for this PaymentRequest3D.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this PaymentRequest3D.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the shopperEmail value for this PaymentRequest3D.
     * 
     * @return shopperEmail
     */
    public java.lang.String getShopperEmail() {
        return shopperEmail;
    }


    /**
     * Sets the shopperEmail value for this PaymentRequest3D.
     * 
     * @param shopperEmail
     */
    public void setShopperEmail(java.lang.String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }


    /**
     * Gets the shopperIP value for this PaymentRequest3D.
     * 
     * @return shopperIP
     */
    public java.lang.String getShopperIP() {
        return shopperIP;
    }


    /**
     * Sets the shopperIP value for this PaymentRequest3D.
     * 
     * @param shopperIP
     */
    public void setShopperIP(java.lang.String shopperIP) {
        this.shopperIP = shopperIP;
    }


    /**
     * Gets the shopperInteraction value for this PaymentRequest3D.
     * 
     * @return shopperInteraction
     */
    public java.lang.String getShopperInteraction() {
        return shopperInteraction;
    }


    /**
     * Sets the shopperInteraction value for this PaymentRequest3D.
     * 
     * @param shopperInteraction
     */
    public void setShopperInteraction(java.lang.String shopperInteraction) {
        this.shopperInteraction = shopperInteraction;
    }


    /**
     * Gets the shopperLocale value for this PaymentRequest3D.
     * 
     * @return shopperLocale
     */
    public java.lang.String getShopperLocale() {
        return shopperLocale;
    }


    /**
     * Sets the shopperLocale value for this PaymentRequest3D.
     * 
     * @param shopperLocale
     */
    public void setShopperLocale(java.lang.String shopperLocale) {
        this.shopperLocale = shopperLocale;
    }


    /**
     * Gets the shopperName value for this PaymentRequest3D.
     * 
     * @return shopperName
     */
    public com.adyen.services.common.Name getShopperName() {
        return shopperName;
    }


    /**
     * Sets the shopperName value for this PaymentRequest3D.
     * 
     * @param shopperName
     */
    public void setShopperName(com.adyen.services.common.Name shopperName) {
        this.shopperName = shopperName;
    }


    /**
     * Gets the shopperReference value for this PaymentRequest3D.
     * 
     * @return shopperReference
     */
    public java.lang.String getShopperReference() {
        return shopperReference;
    }


    /**
     * Sets the shopperReference value for this PaymentRequest3D.
     * 
     * @param shopperReference
     */
    public void setShopperReference(java.lang.String shopperReference) {
        this.shopperReference = shopperReference;
    }


    /**
     * Gets the shopperStatement value for this PaymentRequest3D.
     * 
     * @return shopperStatement
     */
    public java.lang.String getShopperStatement() {
        return shopperStatement;
    }


    /**
     * Sets the shopperStatement value for this PaymentRequest3D.
     * 
     * @param shopperStatement
     */
    public void setShopperStatement(java.lang.String shopperStatement) {
        this.shopperStatement = shopperStatement;
    }


    /**
     * Gets the skinCode value for this PaymentRequest3D.
     * 
     * @return skinCode
     */
    public java.lang.String getSkinCode() {
        return skinCode;
    }


    /**
     * Sets the skinCode value for this PaymentRequest3D.
     * 
     * @param skinCode
     */
    public void setSkinCode(java.lang.String skinCode) {
        this.skinCode = skinCode;
    }


    /**
     * Gets the socialSecurityNumber value for this PaymentRequest3D.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this PaymentRequest3D.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRequest3D)) return false;
        PaymentRequest3D other = (PaymentRequest3D) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalAmount==null && other.getAdditionalAmount()==null) || 
             (this.additionalAmount!=null &&
              this.additionalAmount.equals(other.getAdditionalAmount()))) &&
            ((this.additionalData==null && other.getAdditionalData()==null) || 
             (this.additionalData!=null &&
              java.util.Arrays.equals(this.additionalData, other.getAdditionalData()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.browserInfo==null && other.getBrowserInfo()==null) || 
             (this.browserInfo!=null &&
              this.browserInfo.equals(other.getBrowserInfo()))) &&
            ((this.dccQuote==null && other.getDccQuote()==null) || 
             (this.dccQuote!=null &&
              this.dccQuote.equals(other.getDccQuote()))) &&
            ((this.deliveryAddress==null && other.getDeliveryAddress()==null) || 
             (this.deliveryAddress!=null &&
              this.deliveryAddress.equals(other.getDeliveryAddress()))) &&
            ((this.deliveryDate==null && other.getDeliveryDate()==null) || 
             (this.deliveryDate!=null &&
              this.deliveryDate.equals(other.getDeliveryDate()))) &&
            ((this.deviceFingerprint==null && other.getDeviceFingerprint()==null) || 
             (this.deviceFingerprint!=null &&
              this.deviceFingerprint.equals(other.getDeviceFingerprint()))) &&
            ((this.fraudOffset==null && other.getFraudOffset()==null) || 
             (this.fraudOffset!=null &&
              this.fraudOffset.equals(other.getFraudOffset()))) &&
            ((this.installments==null && other.getInstallments()==null) || 
             (this.installments!=null &&
              this.installments.equals(other.getInstallments()))) &&
            ((this.md==null && other.getMd()==null) || 
             (this.md!=null &&
              this.md.equals(other.getMd()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.orderReference==null && other.getOrderReference()==null) || 
             (this.orderReference!=null &&
              this.orderReference.equals(other.getOrderReference()))) &&
            ((this.paResponse==null && other.getPaResponse()==null) || 
             (this.paResponse!=null &&
              this.paResponse.equals(other.getPaResponse()))) &&
            ((this.persistentCookie==null && other.getPersistentCookie()==null) || 
             (this.persistentCookie!=null &&
              this.persistentCookie.equals(other.getPersistentCookie()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.referrer==null && other.getReferrer()==null) || 
             (this.referrer!=null &&
              this.referrer.equals(other.getReferrer()))) &&
            ((this.selectedBrand==null && other.getSelectedBrand()==null) || 
             (this.selectedBrand!=null &&
              this.selectedBrand.equals(other.getSelectedBrand()))) &&
            ((this.selectedRecurringDetailReference==null && other.getSelectedRecurringDetailReference()==null) || 
             (this.selectedRecurringDetailReference!=null &&
              this.selectedRecurringDetailReference.equals(other.getSelectedRecurringDetailReference()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.shopperEmail==null && other.getShopperEmail()==null) || 
             (this.shopperEmail!=null &&
              this.shopperEmail.equals(other.getShopperEmail()))) &&
            ((this.shopperIP==null && other.getShopperIP()==null) || 
             (this.shopperIP!=null &&
              this.shopperIP.equals(other.getShopperIP()))) &&
            ((this.shopperInteraction==null && other.getShopperInteraction()==null) || 
             (this.shopperInteraction!=null &&
              this.shopperInteraction.equals(other.getShopperInteraction()))) &&
            ((this.shopperLocale==null && other.getShopperLocale()==null) || 
             (this.shopperLocale!=null &&
              this.shopperLocale.equals(other.getShopperLocale()))) &&
            ((this.shopperName==null && other.getShopperName()==null) || 
             (this.shopperName!=null &&
              this.shopperName.equals(other.getShopperName()))) &&
            ((this.shopperReference==null && other.getShopperReference()==null) || 
             (this.shopperReference!=null &&
              this.shopperReference.equals(other.getShopperReference()))) &&
            ((this.shopperStatement==null && other.getShopperStatement()==null) || 
             (this.shopperStatement!=null &&
              this.shopperStatement.equals(other.getShopperStatement()))) &&
            ((this.skinCode==null && other.getSkinCode()==null) || 
             (this.skinCode!=null &&
              this.skinCode.equals(other.getSkinCode()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdditionalAmount() != null) {
            _hashCode += getAdditionalAmount().hashCode();
        }
        if (getAdditionalData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getBrowserInfo() != null) {
            _hashCode += getBrowserInfo().hashCode();
        }
        if (getDccQuote() != null) {
            _hashCode += getDccQuote().hashCode();
        }
        if (getDeliveryAddress() != null) {
            _hashCode += getDeliveryAddress().hashCode();
        }
        if (getDeliveryDate() != null) {
            _hashCode += getDeliveryDate().hashCode();
        }
        if (getDeviceFingerprint() != null) {
            _hashCode += getDeviceFingerprint().hashCode();
        }
        if (getFraudOffset() != null) {
            _hashCode += getFraudOffset().hashCode();
        }
        if (getInstallments() != null) {
            _hashCode += getInstallments().hashCode();
        }
        if (getMd() != null) {
            _hashCode += getMd().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getOrderReference() != null) {
            _hashCode += getOrderReference().hashCode();
        }
        if (getPaResponse() != null) {
            _hashCode += getPaResponse().hashCode();
        }
        if (getPersistentCookie() != null) {
            _hashCode += getPersistentCookie().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getReferrer() != null) {
            _hashCode += getReferrer().hashCode();
        }
        if (getSelectedBrand() != null) {
            _hashCode += getSelectedBrand().hashCode();
        }
        if (getSelectedRecurringDetailReference() != null) {
            _hashCode += getSelectedRecurringDetailReference().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getShopperEmail() != null) {
            _hashCode += getShopperEmail().hashCode();
        }
        if (getShopperIP() != null) {
            _hashCode += getShopperIP().hashCode();
        }
        if (getShopperInteraction() != null) {
            _hashCode += getShopperInteraction().hashCode();
        }
        if (getShopperLocale() != null) {
            _hashCode += getShopperLocale().hashCode();
        }
        if (getShopperName() != null) {
            _hashCode += getShopperName().hashCode();
        }
        if (getShopperReference() != null) {
            _hashCode += getShopperReference().hashCode();
        }
        if (getShopperStatement() != null) {
            _hashCode += getShopperStatement().hashCode();
        }
        if (getSkinCode() != null) {
            _hashCode += getSkinCode().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRequest3D.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", "PaymentRequest3d"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "additionalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "additionalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", ">anyType2anyTypeMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "billingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browserInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "browserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "BrowserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dccQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "dccQuote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", "ForexQuote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "deliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "deliveryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFingerprint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "deviceFingerprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "fraudOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "installments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Installments"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("md");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "md"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "orderReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "paResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistentCookie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "persistentCookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", "Recurring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referrer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "referrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "selectedBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedRecurringDetailReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "selectedRecurringDetailReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperInteraction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperInteraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skinCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "skinCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
