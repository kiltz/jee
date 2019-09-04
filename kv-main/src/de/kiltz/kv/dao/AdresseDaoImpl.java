package de.kiltz.kv.dao;

import de.kiltz.kv.entity.AdresseEntity;
import de.kiltz.kv.entity.KundeEntity;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class AdresseDaoImpl implements AdresseDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public AdresseEntity save(AdresseEntity k) {
		em.persist(k);
		return k;
	}

	@Override
	public AdresseEntity update(AdresseEntity k) {
		k = em.merge(k);
		return k;
	}

	@Override
	public AdresseEntity getById(Long id) {
		AdresseEntity k = em.find(AdresseEntity.class, id );
		return k;
	}

	@Override
	public void delete(Long id) {
		AdresseEntity k = getById(id);
		if (k != null) {
			em.remove(k);
		}
	}

	@Override
	public List<AdresseEntity> findByPLZ(String plz) {
		Query q = em.createQuery("select k from Adresse k where k.plz = :plz");
		q.setParameter("plz",plz);
		List<AdresseEntity> liste = q.getResultList();
		return liste;
	}


}


