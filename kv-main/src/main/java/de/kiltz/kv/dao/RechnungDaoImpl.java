package de.kiltz.kv.dao;

import de.kiltz.kv.entity.RechnungEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class RechnungDaoImpl implements RechnungDao {


    @PersistenceContext
    private EntityManager em;

    public void delete(Long id) {
        RechnungEntity o = getById(id);
        em.remove(o);

    }

    public RechnungEntity getById(Long id) {
        return em.find(RechnungEntity.class, id);
    }

    public Long save(RechnungEntity o) {
        em.persist(o);
        System.out.println("Speichere " + o.getId());
        return o.getId();
    }

    public void update(RechnungEntity o) {
        em.merge(o);
    }

}


