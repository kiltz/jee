
package de.kiltz.seminar.ejb3.ws.komplexer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für getDomainObjectResponse complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="getDomainObjectResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="return" type="{http://komplexer.ws.ejb3.seminar.kiltz.de/}domainObject" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDomainObjectResponse", propOrder = {
    "_return"
})
public class GetDomainObjectResponse {

    @XmlElement(name = "return")
    protected DomainObject _return;

    /**
     * Default no-arg constructor
     * 
     */
    public GetDomainObjectResponse() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public GetDomainObjectResponse(final DomainObject _return) {
        this._return = _return;
    }

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomainObject }
     *     
     */
    public DomainObject getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainObject }
     *     
     */
    public void setReturn(DomainObject value) {
        this._return = value;
    }

}
