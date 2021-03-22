package at.campus02.zam21.pr1;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String []monate = {"Jänner", "Februar", "März", "April",
                "Mai", "Juni", "Juli", "August", "September",
                "Oktober", "November", "Dezember"};

        for(int m = 0; m < monate.length; ++m){
            System.out.println(monate[m] +"[" + (m + 1) + "]");
        }
    }
}
