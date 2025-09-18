package ch04.sec05;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;      // 초기식, 초기화 구문
        while (true) {  // 조건식
            if (!(i <= 10)) {   // 탈출 조건
                break;
            }
            System.out.print(i + " ");
            i++;    // 증감식
        }
    }
}
