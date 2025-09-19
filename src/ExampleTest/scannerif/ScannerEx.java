package exampletest.scannerif;

import java.util.Scanner;


public class ScannerEx {
    public static void main(String[] args) {
        // 이름을 입력받아 출력하는 시스템 완성
        System.out.print("이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("당신의 이름은 " + name + " 입니다.");
        sc.close();
    }
}
