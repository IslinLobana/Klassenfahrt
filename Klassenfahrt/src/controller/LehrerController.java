package controller;
import model.*;
import java.util.*;

public class LehrerController {

    MainController mc;
    ArrayList<Lehrer> lehrerar = new ArrayList<Lehrer>();

    public LehrerController(MainController mc){
        setLehrer(lehrerar);
        setMc(mc);
    }

    public void createLehrer(){
        Lehrer l1 = new Lehrer("Holger", "Trampe", "nein");
        Lehrer l2 = new Lehrer("Marten", "Odens", "ja");
        lehrer.add(l1);
        lehrer.add(l2);
    }

    public void setLehrerar(ArrayList<Lehrer> lehrerar) {
        this.lehrerar = lehrerar;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Lehrer> getLehrerar() {
        return lehrerar;
    }
    public MainController getMc() {
        return mc;
    }
    
}
