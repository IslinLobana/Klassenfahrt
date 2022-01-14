package controller;
import model.*;
import view.*;
import java.util.*;
import java.text.*;

public class KlassenfahrtController {
    Output o = new Output();
    MainController mc;
    ArrayList<Klassenfahrt> klassenfahrt = new ArrayList<Klassenfahrt>();
    DateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.GERMAN);

    public KlassenfahrtController(MainController mc){
        setKlassenfahrt(klassenfahrt);
        setMc(mc);
    }

    public void createKlassen() throws ParseException{
        ArrayList<Lehrer> lehrer1 = new ArrayList<Lehrer>();
        lehrer1.add(getMc().getLc().getLehrer().get(0));
        lehrer1.add(getMc().getLc().getLehrer().get(1));

        ArrayList<Lehrer> lehrer2 = new ArrayList<Lehrer>();
        lehrer2.add(getMc().getLc().getLehrer().get(0));
        lehrer2.add(getMc().getLc().getLehrer().get(1));

        ArrayList<Lehrer> lehrer3 = new ArrayList<Lehrer>();
        lehrer3.add(getMc().getLc().getLehrer().get(0));
        lehrer3.add(getMc().getLc().getLehrer().get(1));

        ArrayList<Lehrer> lehrer4 = new ArrayList<Lehrer>();
        lehrer4.add(getMc().getLc().getLehrer().get(0));


        Klassenfahrt kl1 = new Klassenfahrt(getMc().getReiseziel().get(0), lehrer2,getMc().getKlasse().get(0), format.parse("25.05.2022"), format.parse("30.05.2022"));

        Klassenfahrt kl2 = new Klassenfahrt(getMc().getReiseziel().get(1), lehrer3,getMc().getKlasse().get(1), format.parse("25.05.2022"), format.parse("30.05.2022"));

        Klassenfahrt kl3 = new Klassenfahrt(getMc().getReiseziel().get(1), lehrer1,getMc().getKlasse().get(1), format.parse("25.05.2022"), format.parse("30.05.2022"));


        klassenfahrt.add(kl1);
        klassenfahrt.add(kl2);
        klassenfahrt.add(kl3);

    }

    public void checkKfLehrerBesetzung(){
        for(Klassenfahrt klassenfahrt : klassenfahrt){
            if(klassenfahrt.getZweilehrer().size() < 2){
                o.printData("Es sind zu wenig wenig Lehrer für die Klasse " + klassenfahrt.getKlasse().getName() + " eingetragen");
            }
            else{
                o.printData("Es gibt genug Lehrer für die Klasse " + klassenfahrt.getKlasse().getName());
            }
        }
    }

    public void checkLehrerBedingungen(){
        for(Klassenfahrt klassenfahrt : klassenfahrt){
            if(klassenfahrt.getZweilehrer().size() == 2){
                if((klassenfahrt.getZweilehrer().get(0).getKlassenfahrterlaubnis() != "ja") || (klassenfahrt.getZweilehrer().get(1).getKlassenfahrterlaubnis() != "ja")){
                    o.printData("Die Qualifikation der Lehrkräfte auf der Klassenfahrt von der Klasse " + klassenfahrt.getKlasse().getName() + " reicht nicht aus");
                }
                else{
                    o.printData("Die Qualifikation für die Klassenfahrt von der Klasse " + klassenfahrt.getKlasse().getName() + " reicht aus");
                }
            }
            else{
                break;
            }
        }
    }

    public void checkKfAlter(){
        for(Klassenfahrt klassenfahrt : klassenfahrt){
            if(klassenfahrt.getKlasse().getDurchschnAlter() < klassenfahrt.getReiseziel().getMinAlter()){
                o.printData("Die Alterbedingungen für die Klassenfahrt von der Klasse" + klassenfahrt.getKlasse().getName() + "ist nicht gegeben");
            }
            else{
                o.printData("Die Alterbedingunge für die Klassenfahrt von der Klasse" + klassenfahrt.getKlasse().getName() + "wurden erreicht");
            }
        }
    }

    public void setKlassenfahrt(ArrayList<Klassenfahrt> klassenfahrt) {
        this.klassenfahrt = klassenfahrt;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setO(Output o) {
        this.o = o;
    }
    public ArrayList<Klassenfahrt> getKlassenfahrt() {
        return klassenfahrt;
    }
    public MainController getMc() {
        return mc;
    }
    public Output getO() {
        return o;
    }

    public void checkKlassenfahrtData() {
    }

    public void checkBudget() {
    }

    public void checkLErlaubnis() {
    }


    
    
}
