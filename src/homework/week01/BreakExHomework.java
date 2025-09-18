package homework.week01;

import java.util.Scanner;

public class BreakExHomework {
    public static void main(String[] args) {
        // 2025.09.18 과제
        // 숫자를 입력받아 3의 배수인지 판별하는 프로그램을 작성하세요.
        // 0이 입력되면 종료됩니다.

        System.out.println("0을 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("숫자를 입력하세요 : ");
                int num = sc.nextInt();

                if (num == 0) {
                    System.out.println("0이 입력되었습니다. 프로그램을 종료합니다.");
                    break;
                } else if (num % 3 == 0) {
                    System.out.println(num + "은(는) 3의 배수입니다.");
                    continue;
                } else {
                    System.out.println(num + "은(는) 3의 배수가 아닙니다.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("숫자가 아닙니다. 다시 입력하세요.");
                sc.nextLine();
                continue;
            }
        }
        sc.close();
    }
}
