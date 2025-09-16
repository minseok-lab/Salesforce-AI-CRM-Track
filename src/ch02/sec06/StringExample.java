package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로게이머";

        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str); // 나는 "자바"를 배웁니다.

        str = "번호\t이름\t직업";
        System.out.println(str);

        str = "1001\t홍길동\t프로게이머";
        System.out.println(str);
        System.out.println(str);

    }
}
