package ExampleTest.scannerif;

import java.util.Scanner;

public class ScannerIfElseIfElseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("숫자를 입력하세요 : ");
                int num = sc.nextInt();

                if (num >= 1) {
                    if (num % 2 == 0) {
                        System.out.println("짝수입니다.");
                        break;
                    }
                    else {
                        System.out.println("홀수입니다.");
                        break;
                    }
                }
                
                else if (num == 0) {
                    System.out.println("0입니다.");
                    break;
                }
                
                else {
                    System.out.println("음수입니다.");
                    break;
                }
                
            } catch (Exception e) {
                System.err.println("[경고] 숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }
        }
        sc.close();
    }
}
