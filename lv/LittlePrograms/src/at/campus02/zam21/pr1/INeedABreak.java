package at.campus02.zam21.pr1;

public class INeedABreak {
    public static void main(String[] args) {

        // example does not really make sense
        // just to show you
        for(int i = 0; i < 10; ++i){
            System.out.println(i);
            if (i == 3){
                break;
            }
        }
        System.out.println("Aus Vorbei");

        // example does not really make sense
        // just to show you
        for(int i = 0; i < 10; ++i){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Aus Vorbei");
    }
}
