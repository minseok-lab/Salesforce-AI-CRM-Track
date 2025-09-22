package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(newStr);
        System.out.println(oldStr);

        System.out.println(newStr == oldStr);

        // 새로운 객체를 생성할 경우, 다른 값으로 대체됩니다.
        oldStr = "apple";
        System.out.println(oldStr);
    }
}
