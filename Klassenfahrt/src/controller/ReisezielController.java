package controller;
import model.*;
import java.util.*;

public class ReisezielController {

    MainController mc;
    ArrayList<Reiseziel> reiseziel = new ArrayList<Reiseziel>();

    public ReisezielController(MainController mc){
        setMc(mc);
        setReiseziel(reiseziel);
    }

    void createReiseziel(){
        Reiseziel r1 = new Reiseziel("Dubai", "Dreckshütte", 300, 200, 16);
        Reiseziel r2 = new Reiseziel("Berlin", "Hauseingang", 30, 25., 12);
        reiseziel.add(r1);
        reiseziel.add(r2);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setReiseziel(ArrayList<Reiseziel> reiseziel) {
        this.reiseziel = reiseziel;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Reiseziel> getReiseziel() {
        return reiseziel;
    }

    public void checkReisezielData() {
    }
    
}
