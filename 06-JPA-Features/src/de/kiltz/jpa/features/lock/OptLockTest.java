package de.kiltz.jpa.features.lock;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.cfg.Configuration;

public class OptLockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Einlesen der Standard-Konfig (aus der hibernate.cfg.xml)
		Configuration conf = new Configuration();
		conf.configure();
		// Erzeugung der Session.
		SessionFactory sessionFactory = conf.buildSessionFactory();
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		if (s1 == s2) {
			System.out.println("Fehler! Die Sessions sind gleich!");
		}

		OptLockKunde k = new OptLockKunde("1246", "Locking", "Optimist");
		s1.beginTransaction();
		s1.persist(k);
		s1.getTransaction().commit();
		System.out.println("Nach Persist: " + k.getVersion());

		OptLockKunde k2 = (OptLockKunde) s2.get(OptLockKunde.class, k.getId());
		if (k == k2) {
			System.out.println("Fehler! Die Kunden sind gelich!");
		}
		// Aus der Session holen
		s1.evict(k);
		s2.evict(k2);
		System.out.println("Versionsnummern: " + k.getVersion() + "/"
				+ k2.getVersion());
		k.setName("Ge�ndert");
		k2.setVorname("Auch ge�ndert");
		s1.beginTransaction();
		s1.update(k);
		s1.getTransaction().commit();
		System.out.println("Versionsnummer k: " + k.getVersion());
		try {
			s2.beginTransaction();
			s2.update(k2);
			System.out.println("Versionsnummer k2: " + k2.getVersion());
			s2.getTransaction().commit();

		} catch (StaleObjectStateException e) {
			System.out.println("Fehler geworfen, was richtig war! "
					+ e.getMessage());
		}

		System.out.println(k.getVorname() + " " + k.getName());
		s1.delete(k);
	}

}
