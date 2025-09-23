package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("자동차 모델 : " + myCar.model);
        System.out.println("자동차 속도 : " + myCar.speed);
        System.out.println("자동차 시작 여부 : " + myCar.start);

        // Car 객체의 필드값 변경
        myCar.model = "소나타";
        myCar.speed = 60;
        myCar.start = true;

        // Car 객체의 필드값 읽기
        System.out.println("자동차 모델 : " + myCar.model);
        System.out.println("자동차 속도 : " + myCar.speed);
        System.out.println("자동차 시작 여부 : " + myCar.start);
    }
}
