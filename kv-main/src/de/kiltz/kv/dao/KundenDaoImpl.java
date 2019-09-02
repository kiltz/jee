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

@Singleton
public class KundenDaoImpl implements KundenDao {

	private Map<Long, KundeEntity> store;

	@PostConstruct
	public void init() {
		store = new HashMap<>();
		// Testdaten anlegen
	}
	@Override
	public KundeEntity save(KundeEntity k) {
		k.setId(System.currentTimeMillis());
		store.put(k.getId(), k);
		return k;
	}

	@Override
	public KundeEntity update(KundeEntity k) {
		store.put(k.getId(), k);
		return k;
	}

	@Override
	public KundeEntity getById(Long id) {
		
		return store.get(id);
	}

	@Override
	public void delete(Long id) {
		store.remove(id);

	}

	@Override
	public List<KundeEntity> findByName(String name) {
		List<KundeEntity> erg = new ArrayList<>();
		for (Map.Entry<Long, KundeEntity> e : store.entrySet()) {
			if (e.getValue().getName().contains(name)){
				erg.add(e.getValue());
			}
		}
		return erg;
	}


}


