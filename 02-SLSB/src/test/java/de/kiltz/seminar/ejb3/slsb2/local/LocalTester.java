package de.kiltz.seminar.ejb3.slsb2.local;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.kiltz.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocalTester {

	private static EntfernterDienst service;

	@BeforeClass
	public static void init() throws NamingException {
		InitialContext context = new InitialContext();

		// Referenz auf EJB holen
		service = (EntfernterDienst) context.lookup(EJBTools.machJNDIName(EntfernterDienst.class));

	}

	@Test
	public void testePing() {

		String txt = service.ping("Der entfernte Test");
		assertEquals("vom Entfernten und ein Lokaler text Der entfernte Test", txt);

	}

}
