package de.kiltz.kv.dao;

import de.kiltz.kv.entity.KundeEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface KundenDao {

    KundeEntity save(KundeEntity k);

    KundeEntity update(KundeEntity k);

    KundeEntity getById(Long id);

    void delete(Long id);

    List<KundeEntity> findByName(String name);
}
