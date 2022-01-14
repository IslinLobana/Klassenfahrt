package controller;
import java.text.*;
import view.*;

public class MainController {
    KlasseController kc;
    KlassenfahrtController kfc;
    LehrerController lc;
    ReisezielCOntroller rc;

    Output o = new Output();


    public MainController(){
        setKc(new KlasseController(this));
        setKfc(new KlassenfahrtController(this));
        setLc(new LehrerCOntroller(this));
        setRc(new ReisezielController(this));
    }

    public void createDemo() throws ParseException{
        getKc().checkKlasseData();
        getKfc().checkKlassenfahrtData();
        getLc().checkLehrerData();
        getRc().checkReisezielData();
    }


    public void checkBedingungen(){
        getKfc().checkLBesetzung();
        getKfc().checkBudget();
        getKfc().checkAlter();
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
    public void setRc(ReisezielCOntroller rc) {
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
    public ReisezielCOntroller getRc() {
        return rc;
    }
    
    
}
