package de.kiltz.seminar.ejb3.aufgabe;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Optional;

@Stateless(name="KundenVerwaltung")
public class KundenVerwaltungImpl implements KundenVerwaltung{

    @EJB
    private KundenDAO dao;

    @Override
    public Kunde neuerKunde(Kunde k) throws PflichtfeldException {
        validiere(k);
        k = dao.save(k);
        return k;
    }

    private void validiere(Kunde k) throws PflichtfeldException {
        Optional.of(k).orElseThrow(() -> new PflichtfeldException("Kunde fehlt"));
        if (k.getKdNr() == null || k.getKdNr().isBlank()) {
            throw new PflichtfeldException("Kundennummer fehlt");
        }
        //....
    }

    @Override
    public Kunde aendereKunde(Kunde k) throws PflichtfeldException {
        validiere(k);
        if (k.getId() == null) {
            throw new PflichtfeldException("Update nicht möglich, den Kerl kenne ich nicht.");
        }
        k = dao.update(k);
        return k;
    }

    @Override
    public Kunde holeKunde(Long id) {
        return dao.getById(id);
    }

    @Override
    public void loscheKunde(Long id) {
        dao.delete(id);
    }
}
