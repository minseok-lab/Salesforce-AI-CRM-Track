package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        // int charCode = 'a';
        // int charCode = '5';
        
        System.out.println("charCode = " + charCode);

        if ( 65 <= charCode & charCode <= 90 ) {
            System.out.println("대문자입니다.");
        }

        if ( 97 <= charCode && charCode <= 122 ) {
            System.out.println("소문자입니다.");
        }
        
        if ( 48 <= charCode && charCode <= 57 ) {
            System.out.println("숫자입니다.");
        }

        // ====================================

        int value = 6;
        // int value = 7;

        if ( value % 2 == 0 || value % 3 == 0 ) {
            System.out.println("2 또는 3의 배수입니다.");
        }
        boolean result = (value % 2 == 0 || value % 3 == 0);
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }

        byte num1 = 45;
        byte num2 = 25;
        // byte result = num1 & num2
        int result1 = num1 & num2;
        int result2 = num1 ^ num2;
        System.out.println(result1);
        System.out.println(result2);

    }
}
