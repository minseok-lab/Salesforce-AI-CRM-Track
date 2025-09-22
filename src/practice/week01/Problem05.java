package practice.week01;

public class Problem05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j < 10; j++) {
                System.out.print((j + i) + "\t");
            }
            System.out.println();
        }

        /*
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("O \t");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("X \t");
            }
            System.out.println();
        } 
        */
    }
}
