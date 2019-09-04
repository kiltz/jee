package de.kiltz.seminar.ejb3.secur;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.kiltz.seminar.ejb3.tools.EJBTools;

/**
 * Benutzer: - fk, geheim, user und admin - benutzer, keins, nur user
 * 
 * @author fk
 *
 */
public class SicherheitsDienstClient {

	/**
	 * @param args
	 * @throws NamingException
	 */
	public static void main(String[] args) throws NamingException {
		InitialContext ctx = new InitialContext();

		Object o = ctx.lookup(EJBTools.machJNDIName(SicherheitsDienst.class));
		SicherheitsDienst service = (SicherheitsDienst) o;
		System.out.println(service.fuerAlle(" für Einen"));
		System.out.println(service.fuerUserUndAdmin(" oder auch Admin muss man sein"));
		System.out.println(service.fuerAdmins(" muss man sein"));
	}

}
