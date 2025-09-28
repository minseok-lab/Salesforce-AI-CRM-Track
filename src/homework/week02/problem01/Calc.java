package homework.week02.problem01;

public abstract class Calc {

    // 공통변수 선언
    protected int a;
    protected int b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 공통적으로 double calculate()를 반환하도록 설정
    public abstract double calculate();
}
