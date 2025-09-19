package exampletest.continueif;

public class WhileEx04 {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (true) {
            i++;
            if (i % 6 == 0 && i % 14 == 0) {
                System.out.print(i + "\t");
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
    }
}
