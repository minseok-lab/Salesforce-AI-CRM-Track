package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("제작사 : " + myCar.company);
        System.out.println("자동차 모델 : " + myCar.model);
        System.out.println("자동차 색상 : " + myCar.color);
        System.out.println("자동차 현재속도 : " + myCar.speed);
        System.out.println("자동차 최고속도 : " + myCar.maxSpeed);

        // Car 객체의 필드값 변경
        // myCar.speed = 60;
        myCar.method();

        // Car 객체의 필드값 읽기
        System.out.println("자동차 속도 : " + myCar.speed);
    }
}
