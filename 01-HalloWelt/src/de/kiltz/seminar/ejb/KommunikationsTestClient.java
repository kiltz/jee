package de.kiltz.seminar.ejb;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class KommunikationsTestClient {

    private static final ServerName SERVER_NAME = ServerName.JBOSS_EAP_6_4;

    public static void main(String[] args) throws NamingException {

        InitialContext context = holeContext();
        String jndiName = holeJNDIName();

        KommunikationsTest service = (KommunikationsTest) context
                .lookup(jndiName);
        System.out.println(service.getClass().getName());
        System.out.println(service.ping("kleiner Test "));

    }

    private static String holeJNDIName() {
        String name = null;
        String appName = ""; // Name EAR-File
        String modulName = "KommunikationsTest"; // Name Jar-File
        String distinctName = ""; // Zusatz in Konfig für JBoss7
        String beanName = "KommunikationsTest";
        // String beanName = KommunikationsTestImpl.class.getSimpleName();
        String viewClassName = KommunikationsTest.class.getName();
        switch (SERVER_NAME) {
            case JBOSS_5:
                name = "KommunikationsTest/remote";
                break;
            case JBOSS_7:

                name = "ejb:" + appName + "/" + modulName + "/"
                        + distinctName + "/" + beanName + "!" + viewClassName
                        + "?stateless";

                break;
            case JBOSS_EAP_6_4:

                name = "ejb:" + appName + "/" + modulName + "/"
                        + distinctName + "/" + beanName + "!" + viewClassName;

                break;
            case GLASSFISH:
                name = KommunikationsTest.class.getName();
                break;
            case BEA:
                //@Stateless(name="KommunikationsTest", mappedName="ejb/KommunikationsTest")
                name = "ejb/KommunikationsTest#"+ KommunikationsTest.class.getName();
                break;
        }
        return name;
    }

    private static InitialContext holeContext() throws NamingException {
        Properties props = new Properties();
        switch (SERVER_NAME) {
            case JBOSS_5:
                props.put("java.naming.factory.initial",
                        "org.jnp.interfaces.NamingContextFactory");
                props.put("java.naming.factory.url.pkgs",
                        "org.jboss.naming:org.jnp.interfaces");
                props.put("java.naming.provider.url", "127.0.0.1:1099");
                break;
            case JBOSS_7:
            case JBOSS_EAP_6_4:
                props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
                break;
            case GLASSFISH:
//			props.put(Context.URL_PKG_PREFIXES,
//					"com.sun.enterprise.naming.impl.SerialInitContextFactory");
                break;
            case BEA:
                props.put("java.naming.factory.initial",
                        "weblogic.jndi.WLInitialContextFactory");
                props.put("java.naming.provider.url", "t3://127.0.0.1:7001");

                break;
        }

        return new InitialContext(props);
    }

}

enum ServerName {
    JBOSS_5, JBOSS_7, JBOSS_EAP_6_4, GLASSFISH, BEA;
}
