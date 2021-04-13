package at.campus02.zam21.pr1.little;

public class Diamonds {
    public static void main(String[] args) {

        drawDiamonds(3);
    }

    public static void drawDiamonds(int nrRows) {
        for (int i = 0; i <= nrRows; i++) {
            for (int j = 1; j <= nrRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = nrRows - 1; i >= 1; i--) {
            for (int j = 1; j <= nrRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
