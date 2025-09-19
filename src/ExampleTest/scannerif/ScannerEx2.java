package exampletest.scannerif;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 이름을 입력받은 후, 나이를 입력받는 시스템
        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "살 입니다.");
        sc.close();
    }
}
