package at.campus02.zam21.pr1.little;

public class Quader {
    public double laenge;
    public double breite;
    public double hoehe;

    public double grundflaeche(){
        return laenge * breite;
    }

    public void skaliere(double f){
        laenge *= f;
        breite *= f;
        hoehe *= f;
    }

    public double volumen(){
        return laenge * breite * hoehe;
    }

    public double oberflaeche(){
        return 2 * laenge * breite + 2 * laenge * hoehe + 2 * breite * hoehe;
    }
}
