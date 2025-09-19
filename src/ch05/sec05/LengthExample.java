package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506341230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("올바른 주민등록번호 길이입니다.");
        } else {
            System.out.println("잘못된 주민등록번호 길이입니다");
        }
    }
}
