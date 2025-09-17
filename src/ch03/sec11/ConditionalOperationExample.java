package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;

        // 3항연산자 사용
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(grade);

        // if문 사용
        if (score > 90) {
            grade = 'A';
        }
        else if (score > 80) {
            grade = 'B';
        }
        else {
            grade = 'C';
        }
        System.out.println(grade);
    }
}
