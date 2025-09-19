package practice.pr01;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("숫자" + i + " : ");
            int num = sc.nextInt();
            if (i == 1) {
                maxNum = num;
                continue;
            }
            else if (num >= maxNum) {
                maxNum = num;
            }
        }
        System.out.println("최대값은 " + maxNum + "입니다.");
        sc.close();
    }
}
