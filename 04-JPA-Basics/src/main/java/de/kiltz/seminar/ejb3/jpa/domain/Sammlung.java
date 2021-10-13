package de.kiltz.seminar.ejb3.jpa.domain;

import java.io.Serializable;
import java.util.Date;

public class Sammlung implements Serializable {

    private Integer id;
    private String text;
    private float zahl;
    private Date datum;

    public Sammlung() {

    }

    public Sammlung(String text, float zahl, Date datum) {
        this.text = text;
        this.zahl = zahl;
        this.datum = datum;
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
        return "Sammlung [id=" + id + ", text=" + text + ", zahl=" + zahl + ", datum=" + datum
                + "]";
    }

}
