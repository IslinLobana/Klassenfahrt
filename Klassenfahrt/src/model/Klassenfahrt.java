package model;

import java.util.*;


public class Klassenfahrt {
    
    Reiseziel reiseziel;
    Klasse klasse;
    Date start;
    Date ende;
    ArrayList<Lehrer> lehrer2 = new ArrayList<Lehrer>();


    public Klassenfahrt(Reiseziel reiseziel, Klasse klasse, Date start, Date ende,  ArrayList<Lehrer> lehrer2){
        setReiseziel(reiseziel);
        setKlasse(klasse);
        setStart(start);
        setEnde(ende);
        setLehrer2(lehrer2);
    }

    public void setEnde(Date ende) {
        this.ende = ende;
    }
    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }
    public void setLehrer2(ArrayList<Lehrer> lehrer2) {
        this.lehrer2 = lehrer2;
    }
    public void setReiseziel(Reiseziel reiseziel) {
        this.reiseziel = reiseziel;
    }
    public void setStart(Date start) {
        this.start = start;
    }
    public Date getEnde() {
        return ende;
    }
    public Klasse getKlasse() {
        return klasse;
    }
    public ArrayList<Lehrer> getLehrer2() {
        return lehrer2;
    }
    public Reiseziel getReiseziel() {
        return reiseziel;
    }
    public Date getStart() {
        return start;
    }

    public ArrayList<Klassenfahrt> getZweilehrer() {
        return null;
    }

    public String getKlassenfahrterlaubnis() {
        return null;
    }
}
