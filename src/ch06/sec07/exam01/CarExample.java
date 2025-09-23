package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);
        // Car myCar = new Car(); // 기본 생성자 호출 불가
        System.out.println(myCar);
        // ch06.sec07.exam01.Car@43a25848 -> 주소값 & 클래스명

        Car myCar2 = new Car();
        System.out.println(myCar2);
    }
}
