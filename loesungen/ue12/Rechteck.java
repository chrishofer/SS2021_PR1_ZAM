package at.campus02.zam21.pr1.little;

public class Rechteck {
    public double laenge;
    public double breite;

    public double flaeche(){
        return laenge * breite;
    }
    public void skaliere(double factor){
        laenge *= factor;
        breite *= factor;
    }
}
