//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.30 at 04:15:23 PM CEST
//


package xml.orderstatus.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ORDER_ID"/>
 *         &lt;element ref="{}STATUS"/>
 *         &lt;element ref="{}sessionID"/>
 *         &lt;element ref="{}DESCRIPTION"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
{ "orderid", "status", "sessionID", "description" })
@XmlRootElement(name = "ANSWER")
public class ImportOrderStatusResponse
{
	@XmlElement(name = "ORDER_ID", required = true)
	protected String orderid;

	@XmlElement(name = "STATUS", required = true)
	protected String status;

	@XmlElement(required = true)
	protected String sessionID;

	@XmlElement(name = "DESCRIPTION", required = true)
	protected String description;

	/**
	 * Gets the value of the orderid property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getORDERID()
	{
		return orderid;
	}

	/**
	 * Sets the value of the orderid property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setORDERID(final String value)
	{
		this.orderid = value;
	}

	/**
	 * Gets the value of the status property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSTATUS()
	{
		return status;
	}

	/**
	 * Sets the value of the status property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSTATUS(final String value)
	{
		this.status = value;
	}

	/**
	 * Gets the value of the sessionID property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSessionID()
	{
		return sessionID;
	}

	/**
	 * Sets the value of the sessionID property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSessionID(final String value)
	{
		this.sessionID = value;
	}

	/**
	 * Gets the value of the description property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDESCRIPTION()
	{
		return description;
	}

	/**
	 * Sets the value of the description property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDESCRIPTION(final String value)
	{
		this.description = value;
	}

}
