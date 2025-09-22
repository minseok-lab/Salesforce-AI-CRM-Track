package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3, 4번째 글자

        String subString = subject.substring(location);
        System.out.println(subString);

        location = subject.indexOf("자바");
        System.out.println(location);
        if (location != -1) {
            System.out.println("자바를 포함합니다.");
        } else {
            System.out.println("자바를 포함하지 않습니다.");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println(result);
            System.out.println("자바를 포함합니다.");
        } else {
            System.out.println("자바를 포함하지 않습니다.");
        }
    }
}
