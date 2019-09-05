
package de.kiltz.kv.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.kiltz.kv.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NeuerKunde_QNAME = new QName("http://ws.kv.kiltz.de/", "neuerKunde");
    private final static QName _NeuerKundeResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "neuerKundeResponse");
    private final static QName _LoescheKunde_QNAME = new QName("http://ws.kv.kiltz.de/", "loescheKunde");
    private final static QName _SucheKunde_QNAME = new QName("http://ws.kv.kiltz.de/", "sucheKunde");
    private final static QName _LoescheKundeResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "loescheKundeResponse");
    private final static QName _SucheKundeResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "sucheKundeResponse");
    private final static QName _AendereKundeResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "aendereKundeResponse");
    private final static QName _AendereKunde_QNAME = new QName("http://ws.kv.kiltz.de/", "aendereKunde");
    private final static QName _HoleKunde_QNAME = new QName("http://ws.kv.kiltz.de/", "holeKunde");
    private final static QName _KundenWSException_QNAME = new QName("http://ws.kv.kiltz.de/", "KundenWSException");
    private final static QName _NeueAdresse_QNAME = new QName("http://ws.kv.kiltz.de/", "neueAdresse");
    private final static QName _NeueAdresseResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "neueAdresseResponse");
    private final static QName _HoleKundeResponse_QNAME = new QName("http://ws.kv.kiltz.de/", "holeKundeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.kiltz.kv.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KundenWSException }
     * 
     */
    public KundenWSException createKundenWSException() {
        return new KundenWSException();
    }

    /**
     * Create an instance of {@link NeueAdresse }
     * 
     */
    public NeueAdresse createNeueAdresse() {
        return new NeueAdresse();
    }

    /**
     * Create an instance of {@link HoleKunde }
     * 
     */
    public HoleKunde createHoleKunde() {
        return new HoleKunde();
    }

    /**
     * Create an instance of {@link AendereKunde }
     * 
     */
    public AendereKunde createAendereKunde() {
        return new AendereKunde();
    }

    /**
     * Create an instance of {@link HoleKundeResponse }
     * 
     */
    public HoleKundeResponse createHoleKundeResponse() {
        return new HoleKundeResponse();
    }

    /**
     * Create an instance of {@link NeueAdresseResponse }
     * 
     */
    public NeueAdresseResponse createNeueAdresseResponse() {
        return new NeueAdresseResponse();
    }

    /**
     * Create an instance of {@link SucheKunde }
     * 
     */
    public SucheKunde createSucheKunde() {
        return new SucheKunde();
    }

    /**
     * Create an instance of {@link LoescheKunde }
     * 
     */
    public LoescheKunde createLoescheKunde() {
        return new LoescheKunde();
    }

    /**
     * Create an instance of {@link NeuerKunde }
     * 
     */
    public NeuerKunde createNeuerKunde() {
        return new NeuerKunde();
    }

    /**
     * Create an instance of {@link NeuerKundeResponse }
     * 
     */
    public NeuerKundeResponse createNeuerKundeResponse() {
        return new NeuerKundeResponse();
    }

    /**
     * Create an instance of {@link AendereKundeResponse }
     * 
     */
    public AendereKundeResponse createAendereKundeResponse() {
        return new AendereKundeResponse();
    }

    /**
     * Create an instance of {@link SucheKundeResponse }
     * 
     */
    public SucheKundeResponse createSucheKundeResponse() {
        return new SucheKundeResponse();
    }

    /**
     * Create an instance of {@link LoescheKundeResponse }
     * 
     */
    public LoescheKundeResponse createLoescheKundeResponse() {
        return new LoescheKundeResponse();
    }

    /**
     * Create an instance of {@link AdresseXsd }
     * 
     */
    public AdresseXsd createAdresseXsd() {
        return new AdresseXsd();
    }

    /**
     * Create an instance of {@link KundeXsd }
     * 
     */
    public KundeXsd createKundeXsd() {
        return new KundeXsd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuerKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "neuerKunde")
    public JAXBElement<NeuerKunde> createNeuerKunde(NeuerKunde value) {
        return new JAXBElement<NeuerKunde>(_NeuerKunde_QNAME, NeuerKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeuerKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "neuerKundeResponse")
    public JAXBElement<NeuerKundeResponse> createNeuerKundeResponse(NeuerKundeResponse value) {
        return new JAXBElement<NeuerKundeResponse>(_NeuerKundeResponse_QNAME, NeuerKundeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoescheKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "loescheKunde")
    public JAXBElement<LoescheKunde> createLoescheKunde(LoescheKunde value) {
        return new JAXBElement<LoescheKunde>(_LoescheKunde_QNAME, LoescheKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucheKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "sucheKunde")
    public JAXBElement<SucheKunde> createSucheKunde(SucheKunde value) {
        return new JAXBElement<SucheKunde>(_SucheKunde_QNAME, SucheKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoescheKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "loescheKundeResponse")
    public JAXBElement<LoescheKundeResponse> createLoescheKundeResponse(LoescheKundeResponse value) {
        return new JAXBElement<LoescheKundeResponse>(_LoescheKundeResponse_QNAME, LoescheKundeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SucheKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "sucheKundeResponse")
    public JAXBElement<SucheKundeResponse> createSucheKundeResponse(SucheKundeResponse value) {
        return new JAXBElement<SucheKundeResponse>(_SucheKundeResponse_QNAME, SucheKundeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AendereKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "aendereKundeResponse")
    public JAXBElement<AendereKundeResponse> createAendereKundeResponse(AendereKundeResponse value) {
        return new JAXBElement<AendereKundeResponse>(_AendereKundeResponse_QNAME, AendereKundeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AendereKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "aendereKunde")
    public JAXBElement<AendereKunde> createAendereKunde(AendereKunde value) {
        return new JAXBElement<AendereKunde>(_AendereKunde_QNAME, AendereKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoleKunde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "holeKunde")
    public JAXBElement<HoleKunde> createHoleKunde(HoleKunde value) {
        return new JAXBElement<HoleKunde>(_HoleKunde_QNAME, HoleKunde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KundenWSException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "KundenWSException")
    public JAXBElement<KundenWSException> createKundenWSException(KundenWSException value) {
        return new JAXBElement<KundenWSException>(_KundenWSException_QNAME, KundenWSException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeueAdresse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "neueAdresse")
    public JAXBElement<NeueAdresse> createNeueAdresse(NeueAdresse value) {
        return new JAXBElement<NeueAdresse>(_NeueAdresse_QNAME, NeueAdresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeueAdresseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "neueAdresseResponse")
    public JAXBElement<NeueAdresseResponse> createNeueAdresseResponse(NeueAdresseResponse value) {
        return new JAXBElement<NeueAdresseResponse>(_NeueAdresseResponse_QNAME, NeueAdresseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HoleKundeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.kv.kiltz.de/", name = "holeKundeResponse")
    public JAXBElement<HoleKundeResponse> createHoleKundeResponse(HoleKundeResponse value) {
        return new JAXBElement<HoleKundeResponse>(_HoleKundeResponse_QNAME, HoleKundeResponse.class, null, value);
    }

}
