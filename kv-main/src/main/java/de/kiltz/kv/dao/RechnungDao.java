package de.kiltz.kv.dao;

import de.kiltz.kv.entity.RechnungEntity;

import javax.ejb.Local;

@Local
public interface RechnungDao {

    Long save(RechnungEntity r);

    void update(RechnungEntity r);

    RechnungEntity getById(Long id);

    void delete(Long id);

}
