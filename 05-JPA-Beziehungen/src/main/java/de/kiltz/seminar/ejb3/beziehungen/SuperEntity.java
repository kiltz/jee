package de.kiltz.seminar.ejb3.beziehungen;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public class SuperEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date erzeugtAm;
    private Date letzeAenderung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getErzeugtAm() {
        return erzeugtAm;
    }

    public void setErzeugtAm(Date erzeugtAm) {
        this.erzeugtAm = erzeugtAm;
    }

    public Date getLetzeAenderung() {
        return letzeAenderung;
    }

    public void setLetzeAenderung(Date letzeAenderung) {
        this.letzeAenderung = letzeAenderung;
    }

    @PrePersist
    public void vorPersist() {
        setErzeugtAm(new Date());
    }

    // funktioniert nicht: merge != update
    @PreUpdate
    public void vorUpdate() {
        setLetzeAenderung(new Date());
    }

}
