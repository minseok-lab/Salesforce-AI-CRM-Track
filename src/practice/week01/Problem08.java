package practice.week01;

import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        // "1. 예금" 선택 후 금액을 입력하면 예금액이 합산됩니다.
        // "2. 출금" 선택 후 금액을 입력하면 예금액이 차감됩니다.
        //          잔고 이상으로 출금할 수 없도록 수정해주세요.
        // "3. 잔고" 선택 시 잔고가 출력됩니다.
        // "4. 종료" 선택 시 프로그램이 종료됩니다.

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean run = true;

        while (run) {
            System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			
            int menuNo = sc.nextInt();
            
            switch (menuNo) {
                case 1:
					System.out.print("예금액> ");
					sum += sc.nextInt(); 
					break;
				
                case 2:
                    System.out.print("출금액> ");
                    // 임시로 받을 키보드 입력값을 선언
                    int amount = sc.nextInt();
                    if (sum >= amount && amount > 0) {
                        sum -= amount;
                    }
                    else {
                        System.out.println("잔액이 부족합니다. 초기 화면으로 돌아갑니다.");
                    }
                    break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(sum);
					break;
				
				case 4:
					System.out.print("");
					run = false;
					break;
					
				default :
					System.out.println("다시입력해주세요");
					break;
            }
        }
        System.out.print("프로그램 종료");
		sc.close();
    }
}
