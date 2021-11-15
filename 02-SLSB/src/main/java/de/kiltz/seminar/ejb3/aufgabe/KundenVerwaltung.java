package de.kiltz.seminar.ejb3.aufgabe;

import javax.ejb.Remote;

@Remote
public interface KundenVerwaltung {
    Kunde neuerKunde(Kunde k) throws PflichtfeldException;

    Kunde aendereKunde(Kunde k) throws PflichtfeldException;

    Kunde holeKunde(Long id);

    void loscheKunde(Long id);

}
