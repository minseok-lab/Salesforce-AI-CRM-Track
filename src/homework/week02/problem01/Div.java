package homework.week02.problem01;

public class Div extends Calc {

    @Override
    public double calculate() {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b; // 실수 계산
    }
}