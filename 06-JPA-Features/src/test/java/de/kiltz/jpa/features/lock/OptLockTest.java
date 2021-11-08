package de.kiltz.jpa.features.lock;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OptimisticLockException;
import javax.persistence.Persistence;

public class OptLockTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");

        EntityManager em1 = emf.createEntityManager();
        EntityManager em2 = emf.createEntityManager();

        if (em1 == em2) {
            System.out.println("Fehler! Die Sessions sind gleich!");
        }

        OptLockKunde k = new OptLockKunde("1246", "Locking", "Optimist");
        em1.getTransaction().begin();
        em1.persist(k);
        em1.getTransaction().commit();
        System.out.println("Nach Persist: " + k.getVersion());

        OptLockKunde k2 = (OptLockKunde) em2.find(OptLockKunde.class, k.getId());
        if (k == k2) {
            System.out.println("Fehler! Die Kunden sind gleich!");
        }
        // Aus der Session holen
        em1.detach(k);
        em2.detach(k2);
        System.out.println("Versionsnummern: " + k.getVersion() + "/"
                + k2.getVersion());
        k.setName("Geändert");
        k2.setVorname("Auch geändert");
        em1.getTransaction().begin();
        k = em1.merge(k);
        em1.getTransaction().commit();
        System.out.println("Versionsnummer k: " + k.getVersion());
        try {
            em2.getTransaction().begin();
            System.out.println("Versionsnummer k2: " + k2.getVersion());
            em2.merge(k2);
            em2.getTransaction().commit();

        } catch (StaleObjectStateException | OptimisticLockException e) {
            System.out.println("Fehler geworfen, was richtig war! "
                    + e.getMessage());
        }

        System.out.println(k.getVorname() + " " + k.getName());
        em1.getTransaction().begin();
        k = (OptLockKunde) em1.find(OptLockKunde.class, k.getId());
        em1.remove(k);
        em1.getTransaction().commit();
    }

}
