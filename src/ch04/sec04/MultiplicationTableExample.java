package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        // 구구단 출력
        System.out.println("※ 1단은 출력하지 않습니다.");
        for (int m = 2; m <= 9; m++) {
            System.out.println("=== " + m + "단 ===");
            
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " * " + n + " = " + (m * n));
            }
        }
        
    }
}
