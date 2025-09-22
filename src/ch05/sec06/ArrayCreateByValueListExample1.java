package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] season = { "Spring", "Summer", "Fall", "Winter" };

        // 배열의 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        // 인덱스 i 값 변경
        season[3] = "봄";

        // 170p

    }
}
