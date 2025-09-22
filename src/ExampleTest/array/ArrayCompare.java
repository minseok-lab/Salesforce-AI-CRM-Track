package exampletest.array;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] leftArray = new int[] { 10, 20, 30 };
        int[] rightArray = new int[] { 10, 40, 50 };

        if (leftArray.length != rightArray.length) {
            System.out.println("두 배열의 크기가 다릅니다.");
        }
        else {
            System.out.println("두 배열의 크기가 같습니다.");
            for (int i = 0; i < leftArray.length; i++) {
                if (leftArray[i] != rightArray[i]) {
                    System.out.println((i + 1) + "번째 값이 다릅니다.");
                } else {
                    System.out.println((i + 1) + "번째 값이 같습니다.");
                }
            }
        }
    }
}
