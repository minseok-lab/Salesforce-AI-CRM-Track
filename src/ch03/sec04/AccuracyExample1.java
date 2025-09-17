package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.7;
        int number = 7;

        double result = apple  - (pieceUnit * number);
        System.out.println("사과 1개에서 남은 양 : " + result);

        int apple1 = 1;
        double totalPiece = apple1 * 10;
        int number1 = 7;

        double result1 = totalPiece - number1;
        System.out.println("사과 10개에서 남은 양 : " + result1);
        System.out.println("사과 1개에서 나온 양 : " + result1 / 10.0);
    }
}
