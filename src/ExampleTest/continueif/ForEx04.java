package exampletest.continueif;

public class ForEx04 {
    public static void main(String[] args) {
        /*
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            for (int a = 0; a < 5; a++) {
                for (int b = 5; b > a; b--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        */

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
