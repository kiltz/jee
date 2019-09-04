package de.kiltz.jpa.features.framework;

import java.util.List;

/**
 * DAO-Interface für die Basic-Operationen.
 *
 * @param <Obj> die Entity
 */
public interface BasicDAO<Obj extends SuperEntity>
{
    
    public Obj save(Obj o);
    
    public Obj getById(Long id);
    
    public Obj update(Obj o);
    
    public void delete(Obj o);
    public void deleteById(Long id);
    
    public List<Obj> getAll();
}
