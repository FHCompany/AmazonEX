
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				PayerInfoType 
 * 				Payer information
 * 			
 * 
 * <p>Java class for PayerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Payer" type="{urn:ebay:apis:eBLBaseComponents}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="PayerID" type="{urn:ebay:apis:eBLBaseComponents}UserIDType" minOccurs="0"/>
 *         &lt;element name="PayerStatus" type="{urn:ebay:apis:eBLBaseComponents}PayPalUserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="PayerName" type="{urn:ebay:apis:eBLBaseComponents}PersonNameType"/>
 *         &lt;element name="PayerCountry" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="PayerBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="ContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WalletItems" type="{urn:ebay:apis:eBLBaseComponents}WalletItemsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxIdDetails" type="{urn:ebay:apis:eBLBaseComponents}TaxIdDetailsType" minOccurs="0"/>
 *         &lt;element name="EnhancedPayerInfo" type="{urn:ebay:apis:EnhancedDataTypes}EnhancedPayerInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerInfoType", propOrder = {
    "payer",
    "payerID",
    "payerStatus",
    "payerName",
    "payerCountry",
    "payerBusiness",
    "address",
    "contactPhone",
    "walletItems",
    "taxIdDetails",
    "enhancedPayerInfo"
})
public class PayerInfoType {

    @XmlElement(name = "Payer")
    protected String payer;
    @XmlElement(name = "PayerID")
    protected String payerID;
    @XmlElement(name = "PayerStatus")
    protected PayPalUserStatusCodeType payerStatus;
    @XmlElement(name = "PayerName", required = true)
    protected PersonNameType payerName;
    @XmlElement(name = "PayerCountry")
    protected CountryCodeType payerCountry;
    @XmlElement(name = "PayerBusiness")
    protected String payerBusiness;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "ContactPhone")
    protected String contactPhone;
    @XmlElement(name = "WalletItems")
    protected List<WalletItemsType> walletItems;
    @XmlElement(name = "TaxIdDetails")
    protected TaxIdDetailsType taxIdDetails;
    @XmlElement(name = "EnhancedPayerInfo")
    protected EnhancedPayerInfoType enhancedPayerInfo;

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerID(String value) {
        this.payerID = value;
    }

    /**
     * Gets the value of the payerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PayPalUserStatusCodeType }
     *     
     */
    public PayPalUserStatusCodeType getPayerStatus() {
        return payerStatus;
    }

    /**
     * Sets the value of the payerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPalUserStatusCodeType }
     *     
     */
    public void setPayerStatus(PayPalUserStatusCodeType value) {
        this.payerStatus = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPayerName(PersonNameType value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getPayerCountry() {
        return payerCountry;
    }

    /**
     * Sets the value of the payerCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setPayerCountry(CountryCodeType value) {
        this.payerCountry = value;
    }

    /**
     * Gets the value of the payerBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBusiness() {
        return payerBusiness;
    }

    /**
     * Sets the value of the payerBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBusiness(String value) {
        this.payerBusiness = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the walletItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the walletItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWalletItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WalletItemsType }
     * 
     * 
     */
    public List<WalletItemsType> getWalletItems() {
        if (walletItems == null) {
            walletItems = new ArrayList<WalletItemsType>();
        }
        return this.walletItems;
    }

    /**
     * Gets the value of the taxIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdDetailsType }
     *     
     */
    public TaxIdDetailsType getTaxIdDetails() {
        return taxIdDetails;
    }

    /**
     * Sets the value of the taxIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdDetailsType }
     *     
     */
    public void setTaxIdDetails(TaxIdDetailsType value) {
        this.taxIdDetails = value;
    }

    /**
     * Gets the value of the enhancedPayerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedPayerInfoType }
     *     
     */
    public EnhancedPayerInfoType getEnhancedPayerInfo() {
        return enhancedPayerInfo;
    }

    /**
     * Sets the value of the enhancedPayerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedPayerInfoType }
     *     
     */
    public void setEnhancedPayerInfo(EnhancedPayerInfoType value) {
        this.enhancedPayerInfo = value;
    }

}
