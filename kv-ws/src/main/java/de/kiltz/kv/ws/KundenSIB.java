package de.kiltz.kv.ws;

import de.kiltz.kv.domain.Kunde;
import de.kiltz.kv.service.KundenVerwaltung;
import de.kiltz.kv.service.KundenVerwaltungImpl;
import de.kiltz.kv.service.PflichtfeldException;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(endpointInterface = "de.kiltz.kv.ws.KundenSEI",
        portName = "KundenSIBPort", wsdlLocation = "META-INF/wsdl/KundenSIB.wsdl",
        serviceName = "KundenSIBService")
@Stateless
public class KundenSIB implements KundenSEI {

    @Inject
    private KundenVerwaltung service;

    @Override
    public KundeXML holeKunde(
            Long id) {

        // Delegieren an den Serivce
        Kunde k = service.holeKunde(id);

        // Ausgleichen der Datentypen
        KundeXML ret = new KundeXML();
        ret.setName(k.getName());
        ret.setId(k.getId());
        return ret;
    }

    @Override
    public void neuerKunde(
            Holder<KundeXML> kunde) {

        Kunde k = new Kunde(kunde.value.getName());
        try {
            service.neuerKunde(k);
        } catch (PflichtfeldException e) {
            throw new EJBException(e);
        }
    }

}
