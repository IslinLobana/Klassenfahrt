package model;

public class Lehrer {

    String vorname;
    String nachname;
    String erlaubnis;


    public Lehrer(String vorname, String nachname, String erlaubnis){
        setVorname(vorname);
        setNachname(nachname);
        setErlaubnis(erlaubnis);
    }

    public void setErlaubnis(String erlaubnis) {
        this.erlaubnis = erlaubnis;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getErlaubnis() {
        return erlaubnis;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
    
}
