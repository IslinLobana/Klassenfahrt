package controller;
import java.text.*;
import view.*;

public class MainController {
    KlasseController kc;
    KlassenfahrtController kfc;
    LehrerController lc;
    ReisezielController rc;

    Output o = new Output();


    public MainController(){
        setKc(new KlasseController());
        setKfc(new KlassenfahrtController(this));
        setLc(new LehrerController(this));
        setRc(new ReisezielController(this));
    }

    public void createDemo() throws ParseException{
        getKc().createKlasseData();
        getKfc().checkKlassenfahrtData();
        getLc().checkLehrerData();
        getRc().checkReisezielData();
    }


    public void checkBedingungen(){
        getKfc().checkKfLehrerBesetzung();
        getKfc().checkBudget();
        getKfc().checkKfAlter();
        getKfc().checkLErlaubnis();
    }

    public void setKc(KlasseController kc) {
        this.kc = kc;
    }
    public void setKfc(KlassenfahrtController kfc) {
        this.kfc = kfc;
    }
    public void setLc(LehrerController lc) {
        this.lc = lc;
    }public void setO(Output o) {
        this.o = o;
    }
    public void setRc(ReisezielController rc) {
        this.rc = rc;
    }
    public KlasseController getKc() {
        return kc;
    }
    public KlassenfahrtController getKfc() {
        return kfc;
    }
    public LehrerController getLc() {
        return lc;
    }
    public Output getO() {
        return o;
    }
    public ReisezielController getRc() {
        return rc;
    }

    public Object getReiseziel() {
        return null;
    }

    public Object getKlasse() {
        return null;
    }
    
    
}
