package ch04.sec04;

public class MultiplicationTableTest {
    public static void main(String[] args) {
        // 구구단 표현식으로 옆으로 출력
        for (int i = 2; i <= 9; i++) {
            System.out.print("=== " + i + "단 ===" + "\t");
        }

        System.out.println();

        for (int n = 1; n <= 9; n++) {

            for (int m = 2; m <= 9; m++) {
                System.out.print(m + " * " + n + " = " + (m * n) + "\t");
            }
            System.out.println();
        }
    }
}
