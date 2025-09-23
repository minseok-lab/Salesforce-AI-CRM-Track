package ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    Car(String model) {
        this(model, "은색", 250); // 3. 세 번째 생성자 호출
    }

    Car(String model, String color) {
        this(model, color, 250); // 2. 세 번째 생성자 호출
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model; // 1. 공통 실행 코드
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
