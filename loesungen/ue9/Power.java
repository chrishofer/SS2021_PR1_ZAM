package at.campus02.zam21.pr1.little;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerSimple(2, 10));
        System.out.println(power(2, 9));
        System.out.println(power(2, 10));
        System.out.println(power(2, 5));
  
    }
    public static int powerSimple(int x, int n){
        int erg = 1;


        for (int i = 0; i < n; ++i) {
            erg = erg * x;
        }

        return erg;
    }

    public static int power(int x, int n)
    {
        if (n == 0) {
            return 1;
        }

        // rekursiver aufruf
        int erg = power(x, n / 2);

        // falls ungerade
        if ((n % 2) == 1) {
            return x * erg * erg;
        }

        // falls gerade
        return erg * erg;
    }

}
