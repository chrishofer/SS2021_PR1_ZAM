package at.campus02.zam21.pr1.little;

public class Ticks {
    public static void main(String[] args) {
        System.out.println(naechsteZeckenImpfung(60, 2020, false));
    }
    public static int naechsteZeckenImpfung(int alter, int letztesImpfungsJahr, boolean ersteAuffrischung){
        if(ersteAuffrischung || alter >= 60){
            return letztesImpfungsJahr + 3;
        }
        return letztesImpfungsJahr + 5;
    }
}
