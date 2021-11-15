package de.kiltz.seminar.ejb3.aufgabe;

import java.io.Serializable;

public class Kunde implements Serializable {
    private Long id;
    private String name;
    private String vorname;
    private String kdNr;

    public Kunde() {
    }

    public Kunde(String name, String vorname, String kdNr) {
        this.name = name;
        this.vorname = vorname;
        this.kdNr = kdNr;
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
