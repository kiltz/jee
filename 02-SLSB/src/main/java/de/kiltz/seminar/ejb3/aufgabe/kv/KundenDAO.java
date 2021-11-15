package de.kiltz.seminar.ejb3.aufgabe.kv;

import javax.ejb.Local;

@Local
public interface KundenDAO {
    Kunde save(Kunde k);

    Kunde update(Kunde k);

    Kunde getById(Long id);

    void delete(Long id);

}
