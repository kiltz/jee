package de.kiltz.seminar.ejb3.aufgabe.kv;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.HashMap;
import java.util.Map;

@Stateless(name="KundenDAO")
public class KundenDAOImpl implements KundenDAO {

    private Map<Long, Kunde> kundenListe = new HashMap<>();

    @PostConstruct
    public void init() {
        save(new Kunde("der Schreckliche", "Hägar", "K0001"));
        save(new Kunde("Glückspilz", "Sven", "K0002"));
        save(new Kunde("Hägarsdotter", "Helga", "K0003"));
    }

    @Override
    public Kunde save(Kunde k) {
        k.setId(System.currentTimeMillis());
        kundenListe.put(k.getId(), k);
        return k;
    }

    @Override
    public Kunde update(Kunde k) {
        kundenListe.put(k.getId(), k);
        return k;
    }

    @Override
    public Kunde getById(Long id) {
        return kundenListe.get(id);
    }

    @Override
    public void delete(Long id) {
    kundenListe.remove(id);
    }
}
