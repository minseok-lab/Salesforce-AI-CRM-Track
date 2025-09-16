package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; // 65
        char c2 = 65; // 'A'
        System.out.println(c1 + 1);
        System.out.println(c2);

        char c3 = '가'; // 44032
        char c4 = 55203; // 힣
        System.out.println(c3 + 0);
        System.out.println(c4);

        char c = ' '; // 공백
        System.out.println(c + 0);

        char c5 = 8;
        System.out.println("apple" + c5);
    }
}
