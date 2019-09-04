package de.kiltz.kv.entity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import de.kiltz.kv.domain.Adresse;
import de.kiltz.kv.domain.Kunde;

public class KundeAssembler {

	public static KundeEntity toEntity(Kunde von) {
		KundeEntity nach = new KundeEntity();
		nach.setKdNr(von.getKdNr());
		nach.setName(von.getName());
		nach.setId(von.getId());
		if (von.getAdresse() != null) {
			nach.setAdresse(toEntity(von.getAdresse()));
		}
		return nach;
	}
	public static AdresseEntity toEntity(Adresse von) {
		AdresseEntity a = new AdresseEntity();
		a.setId(von.getId());
		a.setPlz(von.getPlz());
		a.setStrasse(von.getStrasse());
		a.setOrt(von.getOrt());
		return a;
	}
	public static Kunde toDomain(KundeEntity von) {
		Kunde nach = new Kunde();
		nach.setKdNr(von.getKdNr());
		nach.setName(von.getName());
		nach.setId(von.getId());
		if (von.getAdresse() != null) {
			nach.setAdresse(toDomain(von.getAdresse()));
		}
		return nach;
	}
	public static Adresse toDomain(AdresseEntity von) {
		Adresse a = new Adresse();
		a.setId(von.getId());
		a.setPlz(von.getPlz());
		a.setStrasse(von.getStrasse());
		a.setOrt(von.getOrt());
		return a;
	}
	public static List<Kunde> toDomainList(List<KundeEntity> von) {
		List<Kunde> nach = new ArrayList<Kunde>();
		
		for (KundeEntity e : von) {
			nach.add(toDomain(e));
		}
		return nach;
	}
	public static List<KundeEntity> toEntityList(List<Kunde> von) {
		List<KundeEntity> nach = new ArrayList<KundeEntity>();
		
		for (Kunde k : von) {
			nach.add(toEntity(k));
		}
		return nach;
	}

}
