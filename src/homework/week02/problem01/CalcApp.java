package homework.week02.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
        // 스캐너를 호출합니다.
        Scanner sc = new Scanner(System.in);
        // Calc 클래스 타입의 참조 변수를 선언하고 초기값으로 null을 할당합니다.
        // 이 변수는 연산자에 따라 Add, Sub, Mul, Div 객체를 가리키게 됩니다.
        Calc calc = null;
        
        System.out.println("계산식을 입력하세요.");
        System.out.println("정수만 입력 가능합니다.");
        System.out.print(">> ");
        String inputString = sc.nextLine(); // 입력값 정의
        inputString = inputString.trim(); // 입력값 공백 제거

        // "/q"가 입력되기 전까지 반복합니다.
        while (!inputString.equals("/q")) {
            // 사용될 연산자와, 문자열 분리에 필요할 때 사용할 변수를 선언합니다.
            String operator = "";
            String splitRegex = "";

            // 문자열 연산자 확인
            if (inputString.contains("+")) {
                operator = "+";
                splitRegex = "\\+"; // split 메서드에서 '+'는 특별한 의미를 가지므로 '\\'를 붙여 일반 문자로 처리합니다.
            } else if (inputString.contains("-")) {
                operator = "-";
                splitRegex = "-";
            } else if (inputString.contains("*")) {
                operator = "*";
                splitRegex = "\\*"; // split 메서드에서 '*'는 특별한 의미를 가지므로 '\\'를 붙여 일반 문자로 처리합니다.
            } else if (inputString.contains("/")) {
                operator = "/";
                splitRegex = "/";
            } else {
                System.out.println("알 수 없는 연산자입니다.");
                // 다음 입력을 받기 위해 반복문 끝으로 이동합니다.
                System.out.print(">> ");
                inputString = sc.nextLine().trim();
                continue; // 다음 반복을 시작합니다.
            }

            // 위에서 찾은 연산자에 따라 실행할 클래스를 선택합니다.
            switch (operator) {
                case "+":
                    calc = new Add();
                    break;
                case "-":
                    calc = new Sub();
                    break;
                case "*":
                    calc = new Mul();
                    break;
                case "/":
                    calc = new Div();
                    break;
            }

            try {
                // 연산자를 기준으로 입력된 문자열을 두 부분으로 나눕니다.
                String[] splitString = inputString.split(splitRegex);
                int a = Integer.parseInt(splitString[0].trim());
                int b = Integer.parseInt(splitString[1].trim());

                if (calc != null) {
                    calc.setValue(a, b);
                    double result = calc.calculate();
                    // 결과값에 소수점이 있는지 확인합니다.
                    if (result == (int) result) {
                        System.out.println(">> " + (int) result); // 정수를 출력합니다.
                    } else {
                        System.out.printf(">> %.1f%n", result); // 소수점 첫째 자리까지 출력합니다.
                    }
                }
            
            } catch (NumberFormatException e) { // 문자열을 정수로 변환하지 못할 때 발생하는 예외를 처리합니다.
                System.out.println("정수를 입력해야 합니다.");
            } catch (Exception e) { // 그 외의 에러를 처리합니다.
                System.out.println("잘못된 형식입니다.");
            }
            // 다음 계산식을 입력받기 위해 반복문 끝에 추가합니다.
            System.out.print(">> ");
            inputString = sc.nextLine().trim();
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
