package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 'A';

        System.out.print("grade : ");
        System.out.println(grade);

        int score1 = 0;
        switch (grade) {
            case 'A':
                score1 = 100;
                break;
            case 'B':
                score1 = 100 - 20;
                break;
            default:
                score1 = 100 - 40;
                break;
        }
        System.out.println("score1 : " + score1);
            
    }
}
