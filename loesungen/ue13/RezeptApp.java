package at.campus02.zam21.pr1.little;

import java.util.Arrays;

public class RezeptApp {
    public static void main(String[] args) {
        String [] z = {"Mehl", "Butter", "Ziegenkäse", "Milch"};
        double [][]zz = {{100, 0.5}, {50, 1.0}, {200, 3.0}, {1000, 1.2}};

        Rezept rez = new Rezept();

        rez.anzahlPersonen = 4;
        rez.zutatenName = z;
        rez.zutaten = zz;

        System.out.println("Allergisch: " + rez.allergisch("Salami"));
        System.out.println("Allergisch: " + rez.allergisch("Butter"));

        System.out.println(rez.kostet());
        System.out.println(rez.kostetProPerson());
        rez.aenderePersonen(6);
        System.out.println(Arrays.toString(rez.zutaten[0]));
        System.out.println(Arrays.toString(rez.zutaten[1]));
        System.out.println(Arrays.toString(rez.zutaten[2]));
        System.out.println(Arrays.toString(rez.zutaten[3]));
        rez.laktoseFrei();
        System.out.println(Arrays.toString(rez.zutaten[0]));
        System.out.println(Arrays.toString(rez.zutaten[1]));
        System.out.println(Arrays.toString(rez.zutaten[2]));
        System.out.println(Arrays.toString(rez.zutaten[3]));

    }
}
