package ch05.sec07;

public class MultisimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.print("mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
            }
        }
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 90;
        mathScores[0][2] = 100;
        mathScores[1][0] = 70;
        mathScores[1][1] = 80;
        mathScores[1][2] = 90;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }

        // 185p
    }
}
