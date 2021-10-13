package de.kiltz.seminar.ejb3.jpa.framework;

import de.kiltz.seminar.ejb3.jpa.entity.SammlungEntity;

import javax.persistence.PostPersist;

public class LifeListener {

    @PostPersist
    public void nachDemSpeichern(SammlungEntity s) {
        System.out.println("Speichere Los...." + s.getId());
    }
}
