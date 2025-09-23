package ch06.sec06.exam02;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model = "소나타";
    String color = "흰색";
    int maxSpeed = 360;
    int speed;

    void method() {
        speed = 100;
    }

    Car() {
    }
    
    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String color, String model, int maxSpeed) {
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
