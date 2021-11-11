package de.kiltz.kv.service;

import de.kiltz.kv.domain.Kunde;

import java.util.List;

public interface KundenVerwaltung {
    Kunde neuerKunde(Kunde k) throws PflichtfeldException;

    Kunde aendereKunde(Kunde k) throws PflichtfeldException;

    Kunde holeKunde(Long id);

    void loescheKunde(Long id);

    List<Kunde> sucheKunde(String suchBegriff);
}
