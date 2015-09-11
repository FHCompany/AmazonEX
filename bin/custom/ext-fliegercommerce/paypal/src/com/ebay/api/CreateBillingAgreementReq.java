
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}CreateBillingAgreementRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createBillingAgreementRequest"
})
@XmlRootElement(name = "CreateBillingAgreementReq", namespace = "urn:ebay:api:PayPalAPI")
public class CreateBillingAgreementReq {

    @XmlElement(name = "CreateBillingAgreementRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected CreateBillingAgreementRequestType createBillingAgreementRequest;

    /**
     * Gets the value of the createBillingAgreementRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateBillingAgreementRequestType }
     *     
     */
    public CreateBillingAgreementRequestType getCreateBillingAgreementRequest() {
        return createBillingAgreementRequest;
    }

    /**
     * Sets the value of the createBillingAgreementRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBillingAgreementRequestType }
     *     
     */
    public void setCreateBillingAgreementRequest(CreateBillingAgreementRequestType value) {
        this.createBillingAgreementRequest = value;
    }

}
