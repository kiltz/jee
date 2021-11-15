package de.kiltz.seminar.ejb3.aufgabe.kv;

import de.kiltz.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import static org.junit.Assert.*;

public class KundenTester {

	private static KundenVerwaltung service;

	@BeforeClass
	public static void init() throws NamingException {
		InitialContext context = new InitialContext();

		// Referenz auf EJB holen
		service = (KundenVerwaltung) context.lookup(EJBTools.machJNDIName(KundenVerwaltung.class));

	}

	@Test
	public void testeNeuerKunde() {

		Kunde k = null;
		try {
			k = service.neuerKunde(new Kunde("Rossa", "Testa", "K1234"));
			assertNotNull(k.getId());
			Kunde k2 = service.holeKunde(k.getId());
			assertEquals(k.getName(), k2.getName());
		} catch (PflichtfeldException e) {
			fail("Sollte keine Ex werfen.");
		}

	}
	@Test
	public void testeBoeserKunde() {

		Kunde k = null;
		try {
			k = service.neuerKunde(new Kunde("Rossa", "Testa", ""));
			fail("Sollte eine Ex werfen.");
		} catch (PflichtfeldException e) {
			// alles gut!

		}

	}

}
