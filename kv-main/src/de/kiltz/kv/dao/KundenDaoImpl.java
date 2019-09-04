package de.kiltz.kv.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import de.kiltz.kv.entity.KundeEntity;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class KundenDaoImpl implements KundenDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public KundeEntity save(KundeEntity k) {
		System.out.println(k.getKdNr());
		em.persist(k);
		return k;
	}

	@Override
	public KundeEntity update(KundeEntity k) {
		k = em.merge(k);
		return k;
	}

	@Override
	public KundeEntity getById(Long id) {
		KundeEntity k = em.find(KundeEntity.class, id );
		return k;
	}

	@Override
	public void delete(Long id) {
		KundeEntity k = getById(id);
		if (k != null) {
			em.remove(k);
		}
	}

	@Override
	public List<KundeEntity> findByName(String name) {
		Query q = em.createQuery("select k from Kunde k where k.name like :name");
		q.setParameter("name","%"+name+"%");
		List<KundeEntity> liste = q.getResultList();
		return liste;
	}


}


