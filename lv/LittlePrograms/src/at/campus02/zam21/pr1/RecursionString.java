package at.campus02.zam21.pr1;

public class RecursionString {
    public static void main(String[] args) {

        String s = "David Hasselhoff";


        System.out.println(s.startsWith("Hassel"));
        System.out.println(s.startsWith("Davi"));
        System.out.println(s.startsWith("Daiv"));

        System.out.println(strstr("hallo", "all"));
        System.out.println(strstr("hallo", "alloo "));
        System.out.println(strstr("hallo", null));

    }
    public static boolean strstr(String text, String part)
    {
        // weiter optimieren
        if (text == null || part == null){
            return false;
        }
        if (part.length() > text.length())
        {
            return false;
        }
        // Spezialfall gleiche Länge
        if(text.length() == part.length()){
            return text.equals(part);
        }
        // Standardfall
        return text.startsWith(part) || strstr(text.substring(1), part);
    }
}
