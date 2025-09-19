package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "홍길동";

        if (str1 == str2) {
            System.out.println("str1과 str2는 참조가 같습니다.");
        } else {
            System.out.println("str1과 str2는 참조가 다릅니다");
        }

        if (str1.equals(str2)) {
            System.out.println("str1과 str2는 문자열이 같습니다.");
        } else {
            System.out.println("str1과 str2는 문자열이 다릅니다.");
        }


        String str3 = new String("홍길동");
        String str4 = new String("홍길동");

        if (str3 == str4) {
            System.out.println("str3과 str4는 참조가 같습니다.");
        } else {
            System.out.println("str3과 str4는 참조가 다릅니다.");
        }
        
        if (str3.equals(str4)) {
            System.out.println("str3과 str4는 문자열이 같습니다.");
        } else {
            System.out.println("str3과 str4는 문자열이 다릅니다.");
        }
    }
}
