package de.kiltz.kv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Kunde")
public class KundeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 50)
    private String name;

    public KundeEntity() {
    }

    public KundeEntity(String name) {
        super();
        this.name = name;
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

}
