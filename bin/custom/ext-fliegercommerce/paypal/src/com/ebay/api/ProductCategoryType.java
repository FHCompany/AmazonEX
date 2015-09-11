
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Airlines"/>
 *     &lt;enumeration value="Antiques"/>
 *     &lt;enumeration value="Art"/>
 *     &lt;enumeration value="Cameras_Photos"/>
 *     &lt;enumeration value="Cars_Boats_Vehicles_Parts"/>
 *     &lt;enumeration value="CellPhones_Telecom"/>
 *     &lt;enumeration value="Coins_PaperMoney"/>
 *     &lt;enumeration value="Collectibles"/>
 *     &lt;enumeration value="Computers_Networking"/>
 *     &lt;enumeration value="ConsumerElectronics"/>
 *     &lt;enumeration value="Jewelry_Watches"/>
 *     &lt;enumeration value="MusicalInstruments"/>
 *     &lt;enumeration value="RealEstate"/>
 *     &lt;enumeration value="SportsMemorabilia_Cards_FanShop"/>
 *     &lt;enumeration value="Stamps"/>
 *     &lt;enumeration value="Tickets"/>
 *     &lt;enumeration value="Travels"/>
 *     &lt;enumeration value="Gambling"/>
 *     &lt;enumeration value="Alcohol"/>
 *     &lt;enumeration value="Tobacco"/>
 *     &lt;enumeration value="MoneyTransfer"/>
 *     &lt;enumeration value="Software"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductCategoryType")
@XmlEnum
public enum ProductCategoryType {


    /**
     *  Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     *  Airlines
     * 
     */
    @XmlEnumValue("Airlines")
    AIRLINES("Airlines"),

    /**
     *  Antiques
     * 
     */
    @XmlEnumValue("Antiques")
    ANTIQUES("Antiques"),

    /**
     *  Art
     * 
     */
    @XmlEnumValue("Art")
    ART("Art"),

    /**
     *  Cameras & Photos
     * 
     */
    @XmlEnumValue("Cameras_Photos")
    CAMERAS_PHOTOS("Cameras_Photos"),

    /**
     *  Cars, Boats, Vehicles & Parts
     * 
     */
    @XmlEnumValue("Cars_Boats_Vehicles_Parts")
    CARS_BOATS_VEHICLES_PARTS("Cars_Boats_Vehicles_Parts"),

    /**
     *  Cell Phones & Telecom
     * 
     */
    @XmlEnumValue("CellPhones_Telecom")
    CELL_PHONES_TELECOM("CellPhones_Telecom"),

    /**
     *  Coins & Paper Money
     * 
     */
    @XmlEnumValue("Coins_PaperMoney")
    COINS_PAPER_MONEY("Coins_PaperMoney"),

    /**
     *  Collectibles
     * 
     */
    @XmlEnumValue("Collectibles")
    COLLECTIBLES("Collectibles"),

    /**
     *  Computers & Networking
     * 
     */
    @XmlEnumValue("Computers_Networking")
    COMPUTERS_NETWORKING("Computers_Networking"),

    /**
     *  Consumer Electronics
     * 
     */
    @XmlEnumValue("ConsumerElectronics")
    CONSUMER_ELECTRONICS("ConsumerElectronics"),

    /**
     *  Jewelry & Watches
     * 
     */
    @XmlEnumValue("Jewelry_Watches")
    JEWELRY_WATCHES("Jewelry_Watches"),

    /**
     *  Musical Instruments
     * 
     */
    @XmlEnumValue("MusicalInstruments")
    MUSICAL_INSTRUMENTS("MusicalInstruments"),

    /**
     *  Real Estate
     * 
     */
    @XmlEnumValue("RealEstate")
    REAL_ESTATE("RealEstate"),

    /**
     *  Sports Memorabilia, Cards & Fan Shop
     * 
     */
    @XmlEnumValue("SportsMemorabilia_Cards_FanShop")
    SPORTS_MEMORABILIA_CARDS_FAN_SHOP("SportsMemorabilia_Cards_FanShop"),

    /**
     *  Stamps
     * 
     */
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),

    /**
     *  Tickets
     * 
     */
    @XmlEnumValue("Tickets")
    TICKETS("Tickets"),

    /**
     *  Travels
     * 
     */
    @XmlEnumValue("Travels")
    TRAVELS("Travels"),

    /**
     *  Gambling
     * 
     */
    @XmlEnumValue("Gambling")
    GAMBLING("Gambling"),

    /**
     *  Alcohol
     * 
     */
    @XmlEnumValue("Alcohol")
    ALCOHOL("Alcohol"),

    /**
     *  Tobacco
     * 
     */
    @XmlEnumValue("Tobacco")
    TOBACCO("Tobacco"),

    /**
     *  Money Transfer
     * 
     */
    @XmlEnumValue("MoneyTransfer")
    MONEY_TRANSFER("MoneyTransfer"),

    /**
     *  Software
     * 
     */
    @XmlEnumValue("Software")
    SOFTWARE("Software");
    private final String value;

    ProductCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductCategoryType fromValue(String v) {
        for (ProductCategoryType c: ProductCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
