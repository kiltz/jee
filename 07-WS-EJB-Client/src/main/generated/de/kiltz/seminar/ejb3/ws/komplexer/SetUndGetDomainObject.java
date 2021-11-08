
package de.kiltz.seminar.ejb3.ws.komplexer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java-Klasse für setUndGetDomainObject complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="setUndGetDomainObject"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="obj" type="{http://komplexer.ws.ejb3.seminar.kiltz.de/}domainObject" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setUndGetDomainObject", propOrder = {
    "obj"
})
public class SetUndGetDomainObject {

    protected DomainObject obj;

    /**
     * Default no-arg constructor
     * 
     */
    public SetUndGetDomainObject() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SetUndGetDomainObject(final DomainObject obj) {
        this.obj = obj;
    }

    /**
     * Ruft den Wert der obj-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomainObject }
     *     
     */
    public DomainObject getObj() {
        return obj;
    }

    /**
     * Legt den Wert der obj-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainObject }
     *     
     */
    public void setObj(DomainObject value) {
        this.obj = value;
    }

}
