package at.campus02.zam21.pr1.little;

public class Rezept {
    public int anzahlPersonen;
    public String[] zutatenName;
    public double[][] zutaten;


    public boolean allergisch(String zutat){
        for(int z = 0; z < zutatenName.length; ++z){
            if(zutatenName[z].equals(zutat)){
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei(){
        boolean found = false;
        for(int z = 0; z < zutatenName.length; ++z){
            if(zutatenName[z].equals("Milch") || zutatenName[z].contains("käse")){
                found = true;
                zutaten[z][0] = 0;
                zutaten[z][1] = 0.0;
            }
        }
        return found;
    }
    public double kostet(){
        double summe = 0;
        for(int z = 0; z < zutaten.length; ++z){
            summe += zutaten[z][1];
        }
        return summe;
    }
    public double kostetProPerson(){
        return kostet() / anzahlPersonen;
    }
    public void aenderePersonen(int anzahl){
        if(anzahl > 0){
            double factor = (double) anzahl / anzahlPersonen;
            anzahl = anzahlPersonen;
            for(int z = 0; z < zutaten.length; ++z){
                zutaten[z][0] *= factor;
                zutaten[z][1] *= factor;
            }
        }
    }
}
