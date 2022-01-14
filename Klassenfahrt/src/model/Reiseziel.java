package model;

public class Reiseziel {
    String name;
    String hotelname;
    double preisS;
    double preisL;
    double minAlter;

    public Reiseziel(String name, String hotelname, double preisS, double preisL, double minAlter){
        setName(name);
        setHotelname(hotelname);
        setPreisS(preisS);
        setPreisL(preisL);
        setMinAlter(minAlter);
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }
    public void setMinAlter(double minAlter) {
        this.minAlter = minAlter;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPreisL(double preisL) {
        this.preisL = preisL;
    }
    public void setPreisS(double preisS) {
        this.preisS = preisS;
    }
    public String getHotelname() {
        return hotelname;
    }
    public double getMinAlter() {
        return minAlter;
    }
    public String getName() {
        return name;
    }
    public double getPreisL() {
        return preisL;
    }
    public double getPreisS() {
        return preisS;
    }
    
    
}
