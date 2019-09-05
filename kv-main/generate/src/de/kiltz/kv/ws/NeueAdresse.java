
package de.kiltz.kv.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für neueAdresse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="neueAdresse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adresseXsd" type="{http://ws.kv.kiltz.de/}adresseXsd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "neueAdresse", propOrder = {
    "adresseXsd"
})
public class NeueAdresse {

    @XmlElement(required = true)
    protected AdresseXsd adresseXsd;

    /**
     * Ruft den Wert der adresseXsd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdresseXsd }
     *     
     */
    public AdresseXsd getAdresseXsd() {
        return adresseXsd;
    }

    /**
     * Legt den Wert der adresseXsd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresseXsd }
     *     
     */
    public void setAdresseXsd(AdresseXsd value) {
        this.adresseXsd = value;
    }

}
