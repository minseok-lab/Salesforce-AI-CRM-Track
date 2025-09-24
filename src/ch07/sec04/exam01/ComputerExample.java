package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("반지름이 " + r + "인 원의 넓이: " + calculator.areaCircle(r));
        System.out.println();

        // Computer 객체 생성
        Computer myComputer = new Computer();
        System.out.println("반지름이 " + r + "인 원의 넓이: " + myComputer.areaCircle(r));
        System.out.println();
    }
}
