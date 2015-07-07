
package com.ebay.api;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRememberMeStatusDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRememberMeStatusDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalRememberMeStatus" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ExternalRememberMeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalRememberMeStatusDetailsType", propOrder = {
    "externalRememberMeStatus",
    "externalRememberMeID"
})
public class ExternalRememberMeStatusDetailsType {

    @XmlElement(name = "ExternalRememberMeStatus", required = true)
    protected BigInteger externalRememberMeStatus;
    @XmlElement(name = "ExternalRememberMeID")
    protected String externalRememberMeID;

    /**
     * Gets the value of the externalRememberMeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExternalRememberMeStatus() {
        return externalRememberMeStatus;
    }

    /**
     * Sets the value of the externalRememberMeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExternalRememberMeStatus(BigInteger value) {
        this.externalRememberMeStatus = value;
    }

    /**
     * Gets the value of the externalRememberMeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRememberMeID() {
        return externalRememberMeID;
    }

    /**
     * Sets the value of the externalRememberMeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRememberMeID(String value) {
        this.externalRememberMeID = value;
    }

}
