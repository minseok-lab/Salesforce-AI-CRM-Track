package ch02.sec13;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Scanner 연습용

        // 스캐너 객체준비 (키보드와 연결)
        Scanner sc = new Scanner(System.in);

        // 스캐너로 입력받은 문자열을 String 변수에 담기
        String str = sc.nextLine();

        // 입력받은 문자열이 들어있는 str 변수값 출력하기
        System.out.println("키보드로 입력한 문자열 : " + str);

        sc.close();
    }

}
