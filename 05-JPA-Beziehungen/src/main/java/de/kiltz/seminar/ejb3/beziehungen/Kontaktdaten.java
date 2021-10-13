package de.kiltz.seminar.ejb3.beziehungen;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kontaktdaten")
public class Kontaktdaten extends SuperEntity {

    @OneToOne
    @PrimaryKeyJoinColumn
    private Benutzer benutzer;
    @Column(name = "geburtstag")
    @Temporal(TemporalType.DATE)
    private Date geburtstag;

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    @Override
    public String toString() {
        return "Kontaktdaten{" +
                ", geburtstag=" + geburtstag +
                '}';
    }
}
