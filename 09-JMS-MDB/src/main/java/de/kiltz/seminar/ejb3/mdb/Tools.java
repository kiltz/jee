package de.kiltz.seminar.ejb3.mdb;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class Tools {
    public static Context getInitialContext() throws NamingException {
        Properties env = new Properties();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
        env.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
        env.put(Context.SECURITY_PRINCIPAL,"benutzer");
        env.put(Context.SECURITY_CREDENTIALS, "benutzer-123");
        return new InitialContext(env);
    }
}
