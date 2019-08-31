package de.kiltz.seminar.ejb.aufgabe;

import static org.junit.Assert.*;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;


public class InfoServiceTester {

	private InfoService service;
	private static final String JNDI_NAME = 
			"ejb:/KommunikationsTest/InfoService!de.kiltz.seminar.ejb.aufgabe.InfoService";

	@Before
	public void init() throws NamingException{
		Properties props = new Properties();
		props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		InitialContext ctx = new InitialContext(props);
		service = (InfoService) ctx.lookup(JNDI_NAME);
	}
	
	@Test
	public void gestamtTest() {
		assertNotNull(service);
		
		long speicher = service.getFreierSpeicher();
		assertTrue(speicher > 0);
		
		String uhrzeit = service.getUhrzeit();
		assertEquals(uhrzeit.length(), 8);

		String user = service.getUserName();
		assertNotNull(user);
		assertFalse(user.isEmpty());
	}
	
}
