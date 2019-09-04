package de.kiltz.kv.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Adresse")
@Table(name = "Adresse")
public class AdresseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50)
    private String strasse;
    @Column(length = 5)
    private String plz;
    @Column(length = 50)
    private String ort;

    public AdresseEntity() {
    }

    public AdresseEntity(String strasse, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
