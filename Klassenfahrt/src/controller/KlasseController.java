package controller;

import model.*;

import java.util.*;

public class KlasseController {

    MainController mc;

    ArrayList<Klasse> klasse = new ArrayList<Klasse>();

    public KlassenController(MainController mc){
        setKlasse(klasse);
        setMc(mc);
    }

    public void createKlasseData(){

        Klasse k1 = new Klasse("9a", 15, 18.50, 420.40);

        klasse.add(k1);
    }


    public void setKlasse(ArrayList<Klasse> klasse) {
        this.klasse = klasse;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Klasse> getKlasse() {
        return klasse;
    }
    public MainController getMc() {
        return mc;
    }
    
    
}
