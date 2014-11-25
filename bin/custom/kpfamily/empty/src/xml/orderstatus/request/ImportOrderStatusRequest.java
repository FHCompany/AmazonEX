//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.30 at 04:28:40 PM CEST
//


package xml.orderstatus.request;

import java.math.BigDecimal;

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
 *         &lt;element ref="{}LINE_ITEM_ID"/>
 *         &lt;element ref="{}QUANTITY"/>
 *         &lt;element ref="{}FULL_PRICE"/>
 *         &lt;element ref="{}DISCOUNT_VALUE"/>
 *         &lt;element ref="{}PRICE_AMOUNT"/>
 *         &lt;element ref="{}ITEM_NOTE"/>
 *         &lt;element ref="{}STATUS"/>
 *         &lt;element ref="{}TRACKINGID"/>
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
{ "lineitemid", "quantity", "fullprice", "discountvalue", "priceamount", "itemnote", "status", "trackingid" })
@XmlRootElement(name = "ORDER_ITEM")
public class ImportOrderStatusRequest
{
	@XmlElement(name = "LINE_ITEM_ID", required = true)
	protected String lineitemid;

	@XmlElement(name = "QUANTITY")
	protected int quantity;

	@XmlElement(name = "FULL_PRICE", required = true)
	protected BigDecimal fullprice;

	@XmlElement(name = "DISCOUNT_VALUE", required = true)
	protected BigDecimal discountvalue;

	@XmlElement(name = "PRICE_AMOUNT", required = true)
	protected BigDecimal priceamount;

	@XmlElement(name = "ITEM_NOTE", required = true)
	protected String itemnote;

	@XmlElement(name = "STATUS", required = true)
	protected String status;

	@XmlElement(name = "TRACKINGID", required = true)
	protected String trackingid;

	/**
	 * Gets the value of the lineitemid property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getLINEITEMID()
	{
		return lineitemid;
	}

	/**
	 * Sets the value of the lineitemid property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setLINEITEMID(final String value)
	{
		this.lineitemid = value;
	}

	/**
	 * Gets the value of the quantity property.
	 *
	 */
	public int getQUANTITY()
	{
		return quantity;
	}

	/**
	 * Sets the value of the quantity property.
	 *
	 */
	public void setQUANTITY(final int value)
	{
		this.quantity = value;
	}

	/**
	 * Gets the value of the fullprice property.
	 *
	 * @return possible object is {@link BigDecimal }
	 *
	 */
	public BigDecimal getFULLPRICE()
	{
		return fullprice;
	}

	/**
	 * Sets the value of the fullprice property.
	 *
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 *
	 */
	public void setFULLPRICE(final BigDecimal value)
	{
		this.fullprice = value;
	}

	/**
	 * Gets the value of the discountvalue property.
	 *
	 * @return possible object is {@link BigDecimal }
	 *
	 */
	public BigDecimal getDISCOUNTVALUE()
	{
		return discountvalue;
	}

	/**
	 * Sets the value of the discountvalue property.
	 *
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 *
	 */
	public void setDISCOUNTVALUE(final BigDecimal value)
	{
		this.discountvalue = value;
	}

	/**
	 * Gets the value of the priceamount property.
	 *
	 * @return possible object is {@link BigDecimal }
	 *
	 */
	public BigDecimal getPRICEAMOUNT()
	{
		return priceamount;
	}

	/**
	 * Sets the value of the priceamount property.
	 *
	 * @param value
	 *           allowed object is {@link BigDecimal }
	 *
	 */
	public void setPRICEAMOUNT(final BigDecimal value)
	{
		this.priceamount = value;
	}

	/**
	 * Gets the value of the itemnote property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getITEMNOTE()
	{
		return itemnote;
	}

	/**
	 * Sets the value of the itemnote property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setITEMNOTE(final String value)
	{
		this.itemnote = value;
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
	 * Gets the value of the trackingid property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getTRACKINGID()
	{
		return trackingid;
	}

	/**
	 * Sets the value of the trackingid property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setTRACKINGID(final String value)
	{
		this.trackingid = value;
	}

}
