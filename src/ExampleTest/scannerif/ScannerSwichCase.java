package ExampleTest.scannerif;

import java.util.Scanner;

public class ScannerSwichCase {
    public static void main(String[] args) {
        System.out.print("검색할 월을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일입니다.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일입니다.");
                break;
            case 2:
                System.out.println(month + "월은 28일입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        sc.close();
    }
}
