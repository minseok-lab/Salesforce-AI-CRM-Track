package exampletest.continueif;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요. 0이면 종료됩니다");
        System.out.print(">>");

        do {
            num = sc.nextInt();
            sum += num;
            System.out.println("합계 : " + sum);
        }
        while (num != 0);
        System.out.println("종료");

        sc.close();
    }
}
