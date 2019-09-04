package de.kiltz.kv.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "kunde")
@Table(name = "kunde")
public class KundeEntity implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String kdNr;

	@ManyToOne(fetch = FetchType.LAZY)
	private AdresseEntity adresse;

	public KundeEntity() {
	}
 
	public KundeEntity(String name) {
		super();
		this.name = name;
	}

	public AdresseEntity getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseEntity adresse) {
		this.adresse = adresse;
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

	public String getKdNr() {
		return kdNr;
	}

	public void setKdNr(String kdNr) {
		this.kdNr = kdNr;
	}
}
