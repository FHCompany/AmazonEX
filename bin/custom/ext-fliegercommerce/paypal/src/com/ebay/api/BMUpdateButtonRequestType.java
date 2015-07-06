
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMUpdateButtonRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMUpdateButtonRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="HostedButtonID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ButtonType" type="{urn:ebay:apis:eBLBaseComponents}ButtonTypeType" minOccurs="0"/>
 *         &lt;element name="ButtonCode" type="{urn:ebay:apis:eBLBaseComponents}ButtonCodeType" minOccurs="0"/>
 *         &lt;element name="ButtonSubType" type="{urn:ebay:apis:eBLBaseComponents}ButtonSubTypeType" minOccurs="0"/>
 *         &lt;element name="ButtonVar" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/>
 *         &lt;element name="OptionDetails" type="{urn:ebay:api:PayPalAPI}OptionDetailsType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TextBox" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ButtonImage" type="{urn:ebay:apis:eBLBaseComponents}ButtonImageType" minOccurs="0"/>
 *         &lt;element name="ButtonImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyNowText" type="{urn:ebay:apis:eBLBaseComponents}BuyNowTextType" minOccurs="0"/>
 *         &lt;element name="SubscribeText" type="{urn:ebay:apis:eBLBaseComponents}SubscribeTextType" minOccurs="0"/>
 *         &lt;element name="ButtonCountry" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="ButtonLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMUpdateButtonRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "hostedButtonID",
    "buttonType",
    "buttonCode",
    "buttonSubType",
    "buttonVar",
    "optionDetails",
    "textBox",
    "buttonImage",
    "buttonImageURL",
    "buyNowText",
    "subscribeText",
    "buttonCountry",
    "buttonLanguage"
})
public class BMUpdateButtonRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "HostedButtonID", required = true)
    protected String hostedButtonID;
    @XmlElement(name = "ButtonType")
    protected ButtonTypeType buttonType;
    @XmlElement(name = "ButtonCode")
    protected ButtonCodeType buttonCode;
    @XmlElement(name = "ButtonSubType")
    protected ButtonSubTypeType buttonSubType;
    @XmlElement(name = "ButtonVar")
    protected List<String> buttonVar;
    @XmlElement(name = "OptionDetails")
    protected List<OptionDetailsType> optionDetails;
    @XmlElement(name = "TextBox")
    protected List<String> textBox;
    @XmlElement(name = "ButtonImage")
    protected ButtonImageType buttonImage;
    @XmlElement(name = "ButtonImageURL")
    protected String buttonImageURL;
    @XmlElement(name = "BuyNowText")
    protected BuyNowTextType buyNowText;
    @XmlElement(name = "SubscribeText")
    protected SubscribeTextType subscribeText;
    @XmlElement(name = "ButtonCountry")
    protected CountryCodeType buttonCountry;
    @XmlElement(name = "ButtonLanguage")
    protected String buttonLanguage;

    /**
     * Gets the value of the hostedButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedButtonID() {
        return hostedButtonID;
    }

    /**
     * Sets the value of the hostedButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedButtonID(String value) {
        this.hostedButtonID = value;
    }

    /**
     * Gets the value of the buttonType property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonTypeType }
     *     
     */
    public ButtonTypeType getButtonType() {
        return buttonType;
    }

    /**
     * Sets the value of the buttonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonTypeType }
     *     
     */
    public void setButtonType(ButtonTypeType value) {
        this.buttonType = value;
    }

    /**
     * Gets the value of the buttonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonCodeType }
     *     
     */
    public ButtonCodeType getButtonCode() {
        return buttonCode;
    }

    /**
     * Sets the value of the buttonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonCodeType }
     *     
     */
    public void setButtonCode(ButtonCodeType value) {
        this.buttonCode = value;
    }

    /**
     * Gets the value of the buttonSubType property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonSubTypeType }
     *     
     */
    public ButtonSubTypeType getButtonSubType() {
        return buttonSubType;
    }

    /**
     * Sets the value of the buttonSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonSubTypeType }
     *     
     */
    public void setButtonSubType(ButtonSubTypeType value) {
        this.buttonSubType = value;
    }

    /**
     * Gets the value of the buttonVar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buttonVar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButtonVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getButtonVar() {
        if (buttonVar == null) {
            buttonVar = new ArrayList<String>();
        }
        return this.buttonVar;
    }

    /**
     * Gets the value of the optionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionDetailsType }
     * 
     * 
     */
    public List<OptionDetailsType> getOptionDetails() {
        if (optionDetails == null) {
            optionDetails = new ArrayList<OptionDetailsType>();
        }
        return this.optionDetails;
    }

    /**
     * Gets the value of the textBox property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textBox property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTextBox() {
        if (textBox == null) {
            textBox = new ArrayList<String>();
        }
        return this.textBox;
    }

    /**
     * Gets the value of the buttonImage property.
     * 
     * @return
     *     possible object is
     *     {@link ButtonImageType }
     *     
     */
    public ButtonImageType getButtonImage() {
        return buttonImage;
    }

    /**
     * Sets the value of the buttonImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ButtonImageType }
     *     
     */
    public void setButtonImage(ButtonImageType value) {
        this.buttonImage = value;
    }

    /**
     * Gets the value of the buttonImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonImageURL() {
        return buttonImageURL;
    }

    /**
     * Sets the value of the buttonImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonImageURL(String value) {
        this.buttonImageURL = value;
    }

    /**
     * Gets the value of the buyNowText property.
     * 
     * @return
     *     possible object is
     *     {@link BuyNowTextType }
     *     
     */
    public BuyNowTextType getBuyNowText() {
        return buyNowText;
    }

    /**
     * Sets the value of the buyNowText property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyNowTextType }
     *     
     */
    public void setBuyNowText(BuyNowTextType value) {
        this.buyNowText = value;
    }

    /**
     * Gets the value of the subscribeText property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribeTextType }
     *     
     */
    public SubscribeTextType getSubscribeText() {
        return subscribeText;
    }

    /**
     * Sets the value of the subscribeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribeTextType }
     *     
     */
    public void setSubscribeText(SubscribeTextType value) {
        this.subscribeText = value;
    }

    /**
     * Gets the value of the buttonCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getButtonCountry() {
        return buttonCountry;
    }

    /**
     * Sets the value of the buttonCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setButtonCountry(CountryCodeType value) {
        this.buttonCountry = value;
    }

    /**
     * Gets the value of the buttonLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonLanguage() {
        return buttonLanguage;
    }

    /**
     * Sets the value of the buttonLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonLanguage(String value) {
        this.buttonLanguage = value;
    }

}
