package de.kiltz.kv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity mit unterschiedlichen Feldern.
 */
@Entity
//@EntityListeners(LifeListener.class)
@Table(name = "Rechnungen")
public class RechnungEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id")
    private Long id;
    private Integer nummer;

    // Beziehung für 1:N
    @OneToMany(cascade = CascadeType.ALL)
    private List<PositionEntity> positionen;

    // Beziehung für N:N
    @ManyToOne
    private KundeEntity kunde;

    public void addPositionen(PositionEntity position) {
        if (positionen == null) {
            positionen = new ArrayList<PositionEntity>();
        }
        positionen.add(position);
    }

    public List<PositionEntity> getPosition() {
        return positionen;
    }

    public void setPosition(List<PositionEntity> position) {
        this.positionen = position;
    }

    public KundeEntity getKunde() {
        return kunde;
    }

    public void setKunde(KundeEntity kunde) {
        this.kunde = kunde;
    }

    @PostLoad
    public void nachLaden() {
        System.out.println(getId() + " wurde geladen!");
    }

    @PrePersist
    public void vorDemSpeichern() {
        System.out.println("Speichere gleich: " + getId());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "RechnungEntity [id=" + id + ", nummer=" + nummer
                + ", positionen=" + positionen + ", kunde=" + kunde + "]";
    }
}
