package exampletest.scannerif;

import java.util.Scanner;

public class ScannerIfElseCase {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("합격입니다.");
        }
        else {
            System.out.println("불합격입니다.");
        }
        sc.close();
    }
}
