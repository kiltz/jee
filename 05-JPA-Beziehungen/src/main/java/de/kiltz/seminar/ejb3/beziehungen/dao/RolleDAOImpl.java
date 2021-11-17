package de.kiltz.seminar.ejb3.beziehungen.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import de.kiltz.seminar.ejb3.beziehungen.Rolle;

@Stateless(name = "RolleDAO")
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class RolleDAOImpl implements RolleDAO {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Rolle> getAll() throws Exception {
		Query q = em.createQuery("select r from Rolle as r");
		return (List<Rolle>) q.getResultList();
	}

	public Rolle getByName(String nameDerRolle) throws Exception {
		Query q = em.createQuery("select r from Rolle as r where r.name = :name");
		q.setParameter("name", nameDerRolle);
		return (Rolle) q.getSingleResult();
	}

	// Die delegierten Methoden
	public Rolle getById(Integer id) throws Exception {
		return (Rolle) em.find(Rolle.class, id);
	}

	public Rolle save(Rolle o) throws Exception {
		em.persist(o);
		return o;
	}

	public void update(Rolle o) throws Exception {
		em.merge(o);
	}

	public void deleteById(Rolle o) throws Exception {
		em.remove(o);
	}

}
