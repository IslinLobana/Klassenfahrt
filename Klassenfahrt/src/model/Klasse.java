package model;

public class Klasse {

    String name;
    int anzahlSchueler;
    double durchschnAlter;
    double maxBudget;

    public Klasse(String name, int azahlSchueler , double durchschnAlter, double maxBudget){
        setName(name);
        setAnzahlSchueler(anzahlSchueler);
        setDurchschnAlter(durchschnAlter);
        setMaxBudget(maxBudget);
    }

    public void setAnzahlSchueler(int anzahlSchueler) {
        this.anzahlSchueler = anzahlSchueler;
    }

    public void setDurchschnAlter(double durchschnAlter) {
        this.durchschnAlter = durchschnAlter;
    }
    public void setMaxBudget(double maxBudget) {
        this.maxBudget = maxBudget;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAnzahlSchueler() {
        return anzahlSchueler;
    }
    public double getDurchschnAlter() {
        return durchschnAlter;
    }
    public double getMaxBudget() {
        return maxBudget;
    }
    public String getName() {
        return name;
    }
    

    
}
