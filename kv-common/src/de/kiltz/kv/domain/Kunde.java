package de.kiltz.kv.domain;

import java.io.Serializable;
import java.util.Objects;

public class Kunde implements Serializable {
	private Long id;
	private String name;
	private String kdNr;

	private Adresse adresse;

	public Kunde() {
	}

	public Kunde(String name) {
		super();
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
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

	@Override
	public String toString() {
		return "Kunde [id=" + id + ", name=" + name + "]";
	}

}
