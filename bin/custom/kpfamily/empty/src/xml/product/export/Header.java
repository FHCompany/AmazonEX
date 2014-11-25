//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.30 at 06:20:30 PM CEST
//


package xml.product.export;

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
 *         &lt;element ref="{}GENERATOR_INFO"/>
 *         &lt;element ref="{}CATALOG"/>
 *         &lt;element ref="{}SUPPLIER"/>
 *         &lt;element ref="{}BUYER"/>
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
{ "generatorinfo", "catalog", "supplier", "buyer" })
@XmlRootElement(name = "HEADER")
public class Header
{
	@XmlElement(name = "GENERATOR_INFO", required = true)
	protected String generatorinfo;

	@XmlElement(name = "CATALOG", required = true)
	protected Catalog catalog;

	@XmlElement(name = "SUPPLIER", required = true)
	protected Supplier supplier;

	@XmlElement(name = "BUYER", required = true)
	protected Buyer buyer;

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
	 * Gets the value of the catalog property.
	 *
	 * @return possible object is {@link Catalog }
	 *
	 */
	public Catalog getCATALOG()
	{
		return catalog;
	}

	/**
	 * Sets the value of the catalog property.
	 *
	 * @param value
	 *           allowed object is {@link Catalog }
	 *
	 */
	public void setCATALOG(final Catalog value)
	{
		this.catalog = value;
	}

	/**
	 * Gets the value of the supplier property.
	 *
	 * @return possible object is {@link Supplier }
	 *
	 */
	public Supplier getSUPPLIER()
	{
		return supplier;
	}

	/**
	 * Sets the value of the supplier property.
	 *
	 * @param value
	 *           allowed object is {@link Supplier }
	 *
	 */
	public void setSUPPLIER(final Supplier value)
	{
		this.supplier = value;
	}

	/**
	 * Gets the value of the buyer property.
	 *
	 * @return possible object is {@link Buyer }
	 *
	 */
	public Buyer getBUYER()
	{
		return buyer;
	}

	/**
	 * Sets the value of the buyer property.
	 *
	 * @param value
	 *           allowed object is {@link Buyer }
	 *
	 */
	public void setBUYER(final Buyer value)
	{
		this.buyer = value;
	}

}
