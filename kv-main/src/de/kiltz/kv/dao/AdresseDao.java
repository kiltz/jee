package de.kiltz.kv.dao;

import de.kiltz.kv.entity.AdresseEntity;
import de.kiltz.kv.entity.KundeEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface AdresseDao {
	
	AdresseEntity save(AdresseEntity k);
	AdresseEntity update(AdresseEntity k);
	AdresseEntity getById(Long id);
	void delete(Long id);

	List<AdresseEntity> findByPLZ(String plz);
}
