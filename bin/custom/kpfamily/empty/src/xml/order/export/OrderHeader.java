//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.30 at 04:28:15 PM CEST
//


package xml.order.export;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlPath;


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
 *         &lt;element ref="{}CONTROL_INFO"/>
 *         &lt;element ref="{}ORDER_INFO"/>
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
{ "generatorinfo", "generationdate", "orderinfo" })
@XmlRootElement(name = "ORDER_HEADER")
public class OrderHeader
{
	@XmlPath("CONTROL_INFO/GENERATOR_INFO/text()")
	protected String generatorinfo;

	@XmlPath("CONTROL_INFO/GENERATION_DATE/text()")
	@XmlSchemaType(name = "date")
	protected Date generationdate;

	@XmlElement(name = "ORDER_INFO", required = true)
	protected OrderInfo orderinfo;

	/**
	 * Gets the value of the generatorinfo property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getGENERATORINFO()
	{
		return generatorinfo;
	}

	/**
	 * Sets the value of the generatorinfo property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setGENERATORINFO(final String value)
	{
		this.generatorinfo = value;
	}

	/**
	 * Gets the value of the generationdate property.
	 *
	 * @return possible object is {@link Date }
	 *
	 */
	public Date getGENERATIONDATE()
	{
		return generationdate;
	}

	/**
	 * Sets the value of the generationdate property.
	 *
	 * @param value
	 *           allowed object is {@link Date }
	 *
	 */
	public void setGENERATIONDATE(final Date value)
	{
		this.generationdate = value;
	}

	/**
	 * Gets the value of the orderinfo property.
	 *
	 * @return possible object is {@link OrderInfo }
	 *
	 */
	public OrderInfo getORDERINFO()
	{
		return orderinfo;
	}

	/**
	 * Sets the value of the orderinfo property.
	 *
	 * @param value
	 *           allowed object is {@link OrderInfo }
	 *
	 */
	public void setORDERINFO(final OrderInfo value)
	{
		this.orderinfo = value;
	}

}
