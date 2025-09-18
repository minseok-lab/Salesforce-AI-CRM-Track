package homework.week01;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // 입력한 정수가 홀수인지 짝수인지 구분하는 프로그램 완성
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            int i = sc.nextInt();

            if (i % 2 == 0) { // 숫자를 2로 나눈 값의 나머지가 0일 경우 짝수
                System.out.println("'" + i + "' 는 짝수입니다.");
            } else { // 짝수가 아닌 경우 홀수
                System.out.println("'" + i + "' 는 홀수입니다.");
            }
            sc.close(); // 스캐너를 종료합니다.
        }
        
    }
}