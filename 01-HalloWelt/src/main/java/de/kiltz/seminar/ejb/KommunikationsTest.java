package de.kiltz.seminar.ejb;

import javax.ejb.Remote;

@Remote
public interface KommunikationsTest {

    String ping(String txt);
}
