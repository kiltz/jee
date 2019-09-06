
package de.kiltz.kv.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "KundenSEI", targetNamespace = "http://ws.kv.kiltz.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KundenSEI {


    /**
     * 
     * @param id
     * @return
     *     returns de.kiltz.kv.ws.KundeXML
     */
    @WebMethod
    @WebResult(name = "kunde", targetNamespace = "")
    @RequestWrapper(localName = "holeKunde", targetNamespace = "http://ws.kv.kiltz.de/", className = "de.kiltz.kv.ws.HoleKunde")
    @ResponseWrapper(localName = "holeKundeResponse", targetNamespace = "http://ws.kv.kiltz.de/", className = "de.kiltz.kv.ws.HoleKundeResponse")
    public KundeXML holeKunde(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param kunde
     */
    @WebMethod
    @RequestWrapper(localName = "neuerKunde", targetNamespace = "http://ws.kv.kiltz.de/", className = "de.kiltz.kv.ws.NeuerKunde")
    @ResponseWrapper(localName = "neuerKundeResponse", targetNamespace = "http://ws.kv.kiltz.de/", className = "de.kiltz.kv.ws.NeuerKundeResponse")
    public void neuerKunde(
        @WebParam(name = "kunde", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<KundeXML> kunde);

}
