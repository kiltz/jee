package de.kiltz.seminar.ejb3.aufgabe.kv;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.HashMap;
import java.util.Map;

@Stateless(name="KundenDAO")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class KundenDAOImpl implements KundenDAO {

    @PersistenceContext
    private EntityManager em;


    @PostConstruct
    public void init() {
        save(new Kunde("der Schreckliche", "Hägar", "K0001"));
        save(new Kunde("Glückspilz", "Sven", "K0002"));
        save(new Kunde("Hägarsdotter", "Helga", "K0003"));
    }

    @Override
    public Kunde save(Kunde k) {
        em.persist(k);
        k.setKdNr("K"+k.getId());

        return k;
    }

    @Override
    public Kunde update(Kunde k) {
        em.merge(k);
        return k;
    }

    @Override
    public Kunde getById(Long id) {
        return em.find(Kunde.class, id);
    }

    @Override
    public void delete(Long id) {
        Kunde k = getById(id);
        em.remove(k);
    }
}
