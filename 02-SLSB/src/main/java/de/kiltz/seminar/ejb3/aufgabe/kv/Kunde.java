package de.kiltz.seminar.ejb3.aufgabe.kv;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Kunde implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 75)
    private String name;
    @Column(length = 75)
    private String vorname;
    @Column(length = 7, unique = true)
    private String kdNr;

    public Kunde() {
    }

    public Kunde(String name, String vorname, String kdNr) {
        this.name = name;
        this.vorname = vorname;
        this.kdNr = kdNr;
    }

    @PostPersist
    void nachSpeichern() {
        System.out.println("Ganz neuer Kunde mit ID: "+id );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getKdNr() {
        return kdNr;
    }

    public void setKdNr(String kdNr) {
        this.kdNr = kdNr;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", kdNr='" + kdNr + '\'' +
                '}';
    }
}
