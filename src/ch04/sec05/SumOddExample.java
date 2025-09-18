package ch04.sec05;

public class SumOddExample {
    public static void main(String[] args) {
        // 1부터 100까지의 정수 중 홀수만 합산해서 출력
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        }

        /* i를 2씩 더하는 방법
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        */

        System.out.println("1부터 100까지의 홀수의 합 : " + sum);
    }
}
