package controller;
import model.*;
import java.util.*;

public class LehrerController {

    MainController mc;
    ArrayList<Lehrer> lehrer = new ArrayList<Lehrer>();

    public LehrerController(MainController mc){
        setLehrer(lehrer);
        setMc(mc);
    }

    public void createLehrer(){
        Lehrer l1 = new Lehrer("Holger", "Trampe", "nein");
        Lehrer l2 = new Lehrer("Marten", "Odens", "ja");
        Lehrer l3 = new Lehrer("Ole", "Steinhoff", "ja");
        lehrer.add(l1);
        lehrer.add(l2);
        lehrer.add(l3);
    }

    public void setLehrer(ArrayList<Lehrer> lehrer) {
        this.lehrer = lehrer;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Lehrer> getLehrer() {
        return lehrer;
    }
    public MainController getMc() {
        return mc;
    }

    public void checkLehrerData() {
    }
    
}
