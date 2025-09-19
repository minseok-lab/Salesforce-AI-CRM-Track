package exampletest.scannerif;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        /*
         * 68 페이지 연습문제 -- switch-case 사용
         * 과목번호를 입력받아 강의실 번호를 출력하는 프로그램을 작성하세요.
         * 과목 code값이 1이면 “R101호 입니다.” 2이면 “R202호 입니다.” 3이면 “R303호 입니다.” 4이면 “R404호 입니다.”
         * 나머지는 “상담원에게 문의하세요” 를 출력하세요
         */
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("과목번호를 입력하세요 : ");

            try {
                int code = sc.nextInt();
                sc.nextLine();

                switch (code) {
                    case 1:
                        System.out.println("R101호 입니다.");
                        break;
                    case 2:
                        System.out.println("R202호 입니다.");
                        break;
                    case 3:
                        System.out.println("R303호 입니다.");
                        break;
                    case 4:
                        System.out.println("R404호 입니다.");
                        break;
                    default:
                        System.out.println("상담원에게 문의하세요.");
                        break;
                }
                break;
            } catch (Exception e) {
                System.err.println("[오류] 올바른 숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }
        }
        sc.close();
    }
}
