package ch07.sec10.exam01;

public class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    Phone(String owner) {
        this.owner = owner;
    }

    // 메소드 선언
    void turnOn() {
        System.out.println(owner + "님의 전화기가 켜졌습니다.");
    }
    void turnOff() {
        System.out.println(owner + "님의 전화기가 꺼졌습니다.");
    }
}
