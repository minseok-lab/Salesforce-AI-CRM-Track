package ch03.sec07;

import java.util.Scanner;

public class KeyInputTest {
    public static void main(String[] args) {
        System.out.println("[안내] 숫자, 영어 중 한 글자만 입력하세요");
        // 키보드로 문자 하나를 입력받아
        // 대문자인지 소문자인지 숫자인지 판별하는 프로그램 완성
        Scanner sc = new Scanner(System.in);
        
        while (true) { // 정답이 될 때까지 반복합니다.
            
            System.out.print("한 글자 입력: ");
            String line = sc.nextLine(); // 입력창을 생성합니다.
            
            if (line.length() == 0) { // 입력값의 길이가 0(공백)일 경우
                System.out.println("[경고] 입력이 없습니다.");
                continue; // 다시 진행
            }
            else if (line.length() != 1) { // 입력값의 길이가 0(공백)이 아니면서, 1이 아닐(2 이상) 경우
                System.out.println("[경고] 한 글자가 아닙니다.");
                continue; // 다시 진행
            }
            
            char c = line.charAt(0); // 입력된 값의 첫 글자

            if ('A' <= c && c <= 'Z') { // A와 Z 사이에 있을 경우
                System.out.println("대문자입니다.");
                break; // 종료하고 루프 탈출
            } else if ('a' <= c && c <= 'z') { // a와 z 사이에 있을 경우
                System.out.println("소문자입니다.");
                break; // 종료하고 루프 탈출
            } else if ('0' <= c && c <= '9') { // 0과 9 사이에 있을 경우
                System.out.println("숫자입니다.");
                break; // 종료하고 루프 탈출
            } else {
                System.out.println("알파벳이나 숫자가 아닙니다."); // 한 글자인데, 위 조건에 포함되지 않을 경우 다시 처음부터 반복
            }
        }
        
        sc.close(); // 스캐너 객체를 종료합니다.

    }
}
