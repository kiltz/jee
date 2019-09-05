package de.kiltz.kv.ws;

import de.kiltz.kv.domain.Kunde;
import de.kiltz.kv.service.KundenVerwaltung;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "de.kiltz.kv.ws.KundenVerwaltungWebService")
@Stateless
@Remote(de.kiltz.kv.ws.KundenVerwaltungWebService.class)
public class KundenVerwaltungWebServiceImpl implements KundenVerwaltungWebService {
    @EJB
    private KundenVerwaltung service;

    @Override
    public KundeXsd holeKunde(long id) {
        KundeXsd ret = null;
        Kunde k = service.holeKunde(id);
        if (k != null) {
             ret = new KundeXsd();
            // wandel nett um
        }

        return ret;
    }

    @Override
    public List<KundeXsd> sucheKunde(String suchBegriff) {
        return null;
    }

    @Override
    public void loescheKunde(long id) {

    }

    @Override
    public AdresseXsd neueAdresse(AdresseXsd adresseXsd) {
        return null;
    }

    @Override
    public KundeXsd neuerKunde(KundeXsd kundeXsd) throws KundenWSException_Exception {
        return null;
    }

    @Override
    public KundeXsd aendereKunde(KundeXsd kundeXsd) throws KundenWSException_Exception {
        return null;
    }
}
