package de.kiltz.seminar.ejb3.slsb3.ex;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.kiltz.seminar.ejb3.tools.EJBTools;
import org.junit.BeforeClass;
import org.junit.Test;

public class FehlerTester {

    private static FehlerMacher service;

    @BeforeClass
    public static void init() throws NamingException {
        InitialContext context = new InitialContext();
        service = (FehlerMacher) context.lookup(EJBTools.machJNDIName(FehlerMacher.class));

    }

    @Test
    public void testApplicationFehler() {
        System.out.println("ApplicationFehler");

        try {
            service.machApplicationFehler();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSystemFehler() {
        System.out.println("checked SystemFehler");
        service.machCheckedSystemFehler();

    }

}
