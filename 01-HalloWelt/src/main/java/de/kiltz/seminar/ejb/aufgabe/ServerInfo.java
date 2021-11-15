package de.kiltz.seminar.ejb.aufgabe;

import java.time.LocalDateTime;

public class ServerInfo {
    private String benutzerName;
    private long freierSpeicher;
    private LocalDateTime urhzeit;

    public ServerInfo() {
        benutzerName = System.getProperty("user.name");
        freierSpeicher = Runtime.getRuntime().freeMemory();
        urhzeit = LocalDateTime.now();
    }

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }

    public long getFreierSpeicher() {
        return freierSpeicher;
    }

    public void setFreierSpeicher(long freierSpeicher) {
        this.freierSpeicher = freierSpeicher;
    }

    public LocalDateTime getUrhzeit() {
        return urhzeit;
    }

    public void setUrhzeit(LocalDateTime urhzeit) {
        this.urhzeit = urhzeit;
    }
}
