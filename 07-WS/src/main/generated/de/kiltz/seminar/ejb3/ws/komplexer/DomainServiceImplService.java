package de.kiltz.seminar.ejb3.ws.komplexer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.0
 * 2021-11-08T16:46:17.922+01:00
 * Generated source version: 3.4.0
 *
 */
@WebServiceClient(name = "DomainServiceImplService",
                  wsdlLocation = "file:/D:/IdeaProjects/jee/07-WS/src/main/resources/META-INF/wsdl/DomainServiceImpl.wsdl",
                  targetNamespace = "http://komplexer.ws.ejb3.seminar.kiltz.de/")
public class DomainServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://komplexer.ws.ejb3.seminar.kiltz.de/", "DomainServiceImplService");
    public final static QName DomainServiceImplPort = new QName("http://komplexer.ws.ejb3.seminar.kiltz.de/", "DomainServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/IdeaProjects/jee/07-WS/src/main/resources/META-INF/wsdl/DomainServiceImpl.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DomainServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/IdeaProjects/jee/07-WS/src/main/resources/META-INF/wsdl/DomainServiceImpl.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DomainServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DomainServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DomainServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DomainServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DomainServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DomainServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns DomainService
     */
    @WebEndpoint(name = "DomainServiceImplPort")
    public DomainService getDomainServiceImplPort() {
        return super.getPort(DomainServiceImplPort, DomainService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DomainService
     */
    @WebEndpoint(name = "DomainServiceImplPort")
    public DomainService getDomainServiceImplPort(WebServiceFeature... features) {
        return super.getPort(DomainServiceImplPort, DomainService.class, features);
    }

}
