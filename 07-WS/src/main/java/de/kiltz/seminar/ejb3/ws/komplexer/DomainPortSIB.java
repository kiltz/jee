package de.kiltz.seminar.ejb3.ws.komplexer;

import de.kiltz.seminar.ejb3.ws.tools.XMLCalendarTools;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


@Stateless
//@WebService(serviceName="DomainService", portName="DomainServicePort")
@WebService(endpointInterface = "de.kiltz.seminar.ejb3.ws.komplexer.DomainPort",
		portName = "DomainHttpSoapPort", wsdlLocation = "META-INF/wsdl/Domain.wsdl",
        serviceName = "Domain")
@Remote(DomainPort.class)
public class DomainPortSIB implements DomainPort {

    @Override
    public DomainObject getDomainObject() {

        XMLGregorianCalendar datum = XMLCalendarTools.getDate(new Date());
        DomainObject obj = new DomainObject();
        obj.setDatum(datum);
        obj.setId(12345L);
        obj.setText("Ein Text");
        return obj;
    }

    @Override
    public void setDomainObject(DomainObject d) {
        System.out.println(d.getText());

    }

    @Override
    public DomainObject setUndGetDomainObject(DomainObject d) {
        d.setId(1234L);
        return d;
    }

}
