package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3; // x 선언, 3 할당
        int y = 5; // y 선언, 5 할당
        System.out.println("x = " + x + ", y = " + y);

        int temp = x; // temp = 3
        x = y; // x = 5(y)
        y = temp; // y = 3(temp)
        System.out.println("x = " + x + ", y = " + y);
    }
}
