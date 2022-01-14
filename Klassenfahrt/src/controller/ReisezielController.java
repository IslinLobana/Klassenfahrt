package controller;
import model.*;
import java.util.*;

public class ReisezielController {

    MainController mc;
    ArrayList<Reiseziel> reisezielar = new ArrayList<Reiseziel>();

    public ReisezielController(MainController mc){
        setMc(mc);
        setReiseziel(reisezielar);
    }

    createReiseziel(){
        Reiseziel r1 = new Reiseziel("Dubai", "Dreckshütte", 300, 200, 16);
        Reiseziel r2 = new Reiseziel("Berlin", "Hauseingang", 30, 25., 12);
        reisziel.add(r1);
        reiseziel.add(r2);
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setReisezielar(ArrayList<Reiseziel> reisezielar) {
        this.reisezielar = reisezielar;
    }
    public MainController getMc() {
        return mc;
    }
    public ArrayList<Reiseziel> getReisezielar() {
        return reisezielar;
    }
    
}
