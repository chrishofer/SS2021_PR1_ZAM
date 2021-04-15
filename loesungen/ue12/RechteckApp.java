package at.campus02.zam21.pr1.little;

public class RechteckApp {
    public static void main(String[] args) {
        // Test me here
        Rechteck r = new Rechteck();

        r.laenge = 10;
        r.breite = 2;
        System.out.println(r.flaeche());
        r.skaliere(2);
        System.out.println(r.flaeche());
    }
}
