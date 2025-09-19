package homework.week01;

import java.util.Scanner;

public class RamdomIntHomework {
    // practice.pr1.Problem07 문제입니다.
    // 2025.09.19 숙제
    public static void main(String[] args) {
        // 스캐너를 호출합니다.
        Scanner sc = new Scanner(System.in);
        String response = "";
        
        do {
            // 1부터 100까지 숫자 중 
            int randomInt = (int) (Math.random() * 100) + 1;
            int num = 0;

            System.out.println("================================");
            System.out.println("     [숫자맞추기 게임 시작]      ");
            System.out.println("================================");
            System.out.print("숫자를 입력하세요 : ");
            num = sc.nextInt();
            
            // 정답일때까지 질문&답변 반복
            while (true) {
                if (num == randomInt) {
                    System.out.println("정답입니다.");
                    break;
                } else if (num < randomInt) {
                    System.out.print("더 큰 수를 입력하세요 : ");
                    num = sc.nextInt();
                } else {
                    System.out.print("더 작은 수를 입력하세요 : ");
                    num = sc.nextInt();
                }
            }

            System.out.print("게임을 종료하시겠습니까? (y/n) : ");
            response = sc.next();
        } while (response.equals("n")); // n이면 다시 실행
        sc.close();
    }
}
