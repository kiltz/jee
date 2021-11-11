
package de.kiltz.kv.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für holeKundeResponse complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="holeKundeResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kunde" type="{http://ws.kv.kiltz.de/}kundeXML" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "holeKundeResponse", propOrder = {
    "kunde"
})
public class HoleKundeResponse {

    protected KundeXML kunde;

    /**
     * Default no-arg constructor
     * 
     */
    public HoleKundeResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public HoleKundeResponse(final KundeXML kunde) {
        this.kunde = kunde;
    }

    /**
     * Ruft den Wert der kunde-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KundeXML }
     *     
     */
    public KundeXML getKunde() {
        return kunde;
    }

    /**
     * Legt den Wert der kunde-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KundeXML }
     *     
     */
    public void setKunde(KundeXML value) {
        this.kunde = value;
    }

}
