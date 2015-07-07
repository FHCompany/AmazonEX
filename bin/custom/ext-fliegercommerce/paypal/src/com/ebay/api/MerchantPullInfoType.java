
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				MerchantPullInfoType 
 * 				Information about the merchant pull.
 * 			
 * 
 * <p>Java class for MerchantPullInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantPullInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MpStatus" type="{urn:ebay:apis:eBLBaseComponents}MerchantPullStatusCodeType"/>
 *         &lt;element name="MpMax" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="MpCustom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Invoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Custom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentSourceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantPullInfoType", propOrder = {
    "mpStatus",
    "mpMax",
    "mpCustom",
    "desc",
    "invoice",
    "custom",
    "paymentSourceID"
})
public class MerchantPullInfoType {

    @XmlElement(name = "MpStatus", required = true)
    protected MerchantPullStatusCodeType mpStatus;
    @XmlElement(name = "MpMax", required = true)
    protected BasicAmountType mpMax;
    @XmlElement(name = "MpCustom")
    protected String mpCustom;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Invoice")
    protected String invoice;
    @XmlElement(name = "Custom")
    protected String custom;
    @XmlElement(name = "PaymentSourceID")
    protected String paymentSourceID;

    /**
     * Gets the value of the mpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantPullStatusCodeType }
     *     
     */
    public MerchantPullStatusCodeType getMpStatus() {
        return mpStatus;
    }

    /**
     * Sets the value of the mpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantPullStatusCodeType }
     *     
     */
    public void setMpStatus(MerchantPullStatusCodeType value) {
        this.mpStatus = value;
    }

    /**
     * Gets the value of the mpMax property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getMpMax() {
        return mpMax;
    }

    /**
     * Sets the value of the mpMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setMpMax(BasicAmountType value) {
        this.mpMax = value;
    }

    /**
     * Gets the value of the mpCustom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpCustom() {
        return mpCustom;
    }

    /**
     * Sets the value of the mpCustom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpCustom(String value) {
        this.mpCustom = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom(String value) {
        this.custom = value;
    }

    /**
     * Gets the value of the paymentSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSourceID() {
        return paymentSourceID;
    }

    /**
     * Sets the value of the paymentSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSourceID(String value) {
        this.paymentSourceID = value;
    }

}
