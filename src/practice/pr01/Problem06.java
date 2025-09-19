package practice.pr01;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = num; i > 0; i -= 2) {
            sum += i;
        }
        System.out.println("합은 " + sum + "입니다.");
        

        /*
        if (num % 2 == 0) {
            for (int i = 0; i <= num; i += 2) {
                sum += i;
            }
            System.out.println("짝수의 합은 " + sum + "입니다.");
        }
        else {
            for (int i = 1; i <= num; i += 2) {
                sum += i;
            }
            System.out.println("홀수의 합은 " + sum + "입니다.");
        }
            */

        sc.close();
    }
}
