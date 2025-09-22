package ch05.sec06;

public class ArrayTestExample {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 대입
        int[][] scores = {
            { 80, 92, 96},
            { 75, 88 }
        };
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        System.out.println(scores[1].length);
    }
}
