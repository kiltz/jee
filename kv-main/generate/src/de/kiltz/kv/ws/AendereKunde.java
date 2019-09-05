
package de.kiltz.kv.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für aendereKunde complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="aendereKunde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kundeXsd" type="{http://ws.kv.kiltz.de/}kundeXsd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aendereKunde", propOrder = {
    "kundeXsd"
})
public class AendereKunde {

    @XmlElement(required = true)
    protected KundeXsd kundeXsd;

    /**
     * Ruft den Wert der kundeXsd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KundeXsd }
     *     
     */
    public KundeXsd getKundeXsd() {
        return kundeXsd;
    }

    /**
     * Legt den Wert der kundeXsd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KundeXsd }
     *     
     */
    public void setKundeXsd(KundeXsd value) {
        this.kundeXsd = value;
    }

}
