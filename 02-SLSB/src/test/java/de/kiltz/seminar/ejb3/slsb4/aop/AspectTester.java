package de.kiltz.seminar.ejb3.slsb4.aop;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.kiltz.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AspectTester {

	private static AspectService service;

	@BeforeClass
	public static void init() throws NamingException {
		InitialContext ctx = new InitialContext();
		service = (AspectService) ctx.lookup(EJBTools.machJNDIName(AspectService.class));

	}

	@Test
	public void testePing() {

		String txt = service.ping("Hallo Aspect!");
		assertEquals("HALLO ASPECT!", txt);
	}

}
