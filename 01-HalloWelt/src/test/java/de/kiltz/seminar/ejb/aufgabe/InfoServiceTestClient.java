package de.kiltz.seminar.ejb.aufgabe;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class InfoServiceTestClient {

    private static InfoService service;

    @BeforeClass
    public static void init() throws NamingException {
        InitialContext context = holeContext();
        String jndiName = holeJNDIName();
        System.out.println(jndiName);
        service = (InfoService) context
                .lookup(jndiName);
        System.out.println(service.getClass().getName());

    }

    @Test
    public void kleinerTest() {

        String ben = service.getBenutzerName();
        System.out.println(ben);
        System.out.println(service.getFreierSpeicher());
        System.out.println(service.getUhrzeit().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        ServerInfo info = service.getServerInfo();
        System.out.println(info.getBenutzerName());

    }

    private static String holeJNDIName() {
        String name = null;
        String appName = ""; // Name EAR-File
        String modulName = "HalloWelt"; // Name Jar-File
        String distinctName = ""; // Zusatz in Konfig für JBoss7
        String beanName = "InfoService";
        // String beanName = KommunikationsTestImpl.class.getSimpleName();
        String viewClassName = InfoService.class.getName();

        name = "ejb:" + appName + "/" + modulName + "/"
                + distinctName + "/" + beanName + "!" + viewClassName;
        return name;
    }

    private static InitialContext holeContext() throws NamingException {
        Properties props = new Properties();
        props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

        return new InitialContext(props);
    }

}

