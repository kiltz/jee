package de.kiltz.seminar.ejb3.jpa.entity;

import de.kiltz.seminar.ejb3.jpa.framework.LifeListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity mit unterschiedlichen Feldern.
 */
@Entity(name = "Sammlung")
@EntityListeners(LifeListener.class)
@Table(name = "SAMMLUNG")
@NamedQuery(name = "suche", query = "select s from Sammlung s where s.text like :suche")
public class SammlungEntity implements Serializable {

    @Id
    @GeneratedValue
    // @Column(name = "id")
    private Integer id;

    private String text;
    private float zahl;
    @Temporal(TemporalType.DATE)
    private Date datum;

    @PostLoad
    public void nachLaden() {
        System.out.println(getId() + " wurde geladen!");
    }

    @PrePersist
    public void vorDemSpeichern() {
        System.out.println("Speichere gleich: " + getId());
    }

    @PreUpdate
    public void vorDemAktualisieren() {
        System.out.println("Aktualisiere gleich: " + getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getZahl() {
        return zahl;
    }

    public void setZahl(float zahl) {
        this.zahl = zahl;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }


    @Override
    public String toString() {
        return "SammlungEntity [id=" + id + ", text=" + text + ", zahl=" + zahl + ", datum=" + datum + "]";
    }
}
