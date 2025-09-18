package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);;
    }
}
