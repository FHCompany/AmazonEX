
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AboutMePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EAISToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}Email"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}FeedbackScore" minOccurs="0"/>
 *         &lt;element name="FeedbackPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/>
 *         &lt;element name="IDVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}RegistrationAddress" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}Site" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UserStatusCodeType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}UserID" minOccurs="0"/>
 *         &lt;element name="UserIDChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserIDLastChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VATStatus" type="{urn:ebay:apis:eBLBaseComponents}VATStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BuyerInfo" type="{urn:ebay:apis:eBLBaseComponents}BuyerType" minOccurs="0"/>
 *         &lt;element name="SellerInfo" type="{urn:ebay:apis:eBLBaseComponents}SellerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserType", propOrder = {
    "aboutMePage",
    "eaisToken",
    "email",
    "feedbackScore",
    "feedbackPrivate",
    "feedbackRatingStar",
    "idVerified",
    "newUser",
    "registrationAddress",
    "registrationDate",
    "site",
    "status",
    "userID",
    "userIDChanged",
    "userIDLastChanged",
    "vatStatus",
    "buyerInfo",
    "sellerInfo"
})
public class UserType {

    @XmlElement(name = "AboutMePage")
    protected Boolean aboutMePage;
    @XmlElement(name = "EAISToken")
    protected String eaisToken;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "FeedbackScore")
    protected Integer feedbackScore;
    @XmlElement(name = "FeedbackPrivate")
    protected Boolean feedbackPrivate;
    @XmlElement(name = "FeedbackRatingStar")
    protected FeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "IDVerified")
    protected Boolean idVerified;
    @XmlElement(name = "NewUser")
    protected Boolean newUser;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "Site")
    protected SiteCodeType site;
    @XmlElement(name = "Status")
    protected UserStatusCodeType status;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "UserIDChanged")
    protected Boolean userIDChanged;
    @XmlElement(name = "UserIDLastChanged")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userIDLastChanged;
    @XmlElement(name = "VATStatus")
    protected VATStatusCodeType vatStatus;
    @XmlElement(name = "BuyerInfo")
    protected BuyerType buyerInfo;
    @XmlElement(name = "SellerInfo")
    protected SellerType sellerInfo;

    /**
     * Gets the value of the aboutMePage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAboutMePage() {
        return aboutMePage;
    }

    /**
     * Sets the value of the aboutMePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAboutMePage(Boolean value) {
        this.aboutMePage = value;
    }

    /**
     * Gets the value of the eaisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAISToken() {
        return eaisToken;
    }

    /**
     * Sets the value of the eaisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAISToken(String value) {
        this.eaisToken = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 
     * 			  		Feedback scores are a quantitative expression of the desirability of dealing 
     * 			  		with that person as a Buyer or a Seller in auction transactions. Each 
     * 			  		auction transaction can result in one feedback entry for a given user 
     * 			  		(the Buyer can leave one feedback about the Seller and the Seller can leave 
     * 			  		one feedback about the Buyer). That one feedback can be positive, negative, 
     * 			  		or neutral. The aggregated feedback counts for a particular user represent 
     * 			  		that user's overall feedback score (referred to as a "feedback rating" on the 
     * 			  		eBay site). This rating is commonly expressed as the eBay Feedback score
     * 			  		for the user. 
     * 			       
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * Sets the value of the feedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
    }

    /**
     * Gets the value of the feedbackPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackPrivate() {
        return feedbackPrivate;
    }

    /**
     * Sets the value of the feedbackPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackPrivate(Boolean value) {
        this.feedbackPrivate = value;
    }

    /**
     * Gets the value of the feedbackRatingStar property.
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * Sets the value of the feedbackRatingStar property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(FeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * Gets the value of the idVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDVerified() {
        return idVerified;
    }

    /**
     * Sets the value of the idVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDVerified(Boolean value) {
        this.idVerified = value;
    }

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUser(Boolean value) {
        this.newUser = value;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatusCodeType }
     *     
     */
    public UserStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusCodeType }
     *     
     */
    public void setStatus(UserStatusCodeType value) {
        this.status = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userIDChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserIDChanged() {
        return userIDChanged;
    }

    /**
     * Sets the value of the userIDChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserIDChanged(Boolean value) {
        this.userIDChanged = value;
    }

    /**
     * Gets the value of the userIDLastChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUserIDLastChanged() {
        return userIDLastChanged;
    }

    /**
     * Sets the value of the userIDLastChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUserIDLastChanged(XMLGregorianCalendar value) {
        this.userIDLastChanged = value;
    }

    /**
     * Gets the value of the vatStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VATStatusCodeType }
     *     
     */
    public VATStatusCodeType getVATStatus() {
        return vatStatus;
    }

    /**
     * Sets the value of the vatStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VATStatusCodeType }
     *     
     */
    public void setVATStatus(VATStatusCodeType value) {
        this.vatStatus = value;
    }

    /**
     * Gets the value of the buyerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerType }
     *     
     */
    public BuyerType getBuyerInfo() {
        return buyerInfo;
    }

    /**
     * Sets the value of the buyerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerType }
     *     
     */
    public void setBuyerInfo(BuyerType value) {
        this.buyerInfo = value;
    }

    /**
     * Gets the value of the sellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SellerType }
     *     
     */
    public SellerType getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets the value of the sellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerType }
     *     
     */
    public void setSellerInfo(SellerType value) {
        this.sellerInfo = value;
    }

}
