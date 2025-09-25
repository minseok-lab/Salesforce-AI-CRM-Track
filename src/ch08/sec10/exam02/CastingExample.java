package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언과 구현 객체 대입
        Vehicle v = new Bus();

        // Vehicle 인터페이스 메소드 호출
        v.run();

        // 강제 타입 변환 후 호출
        Bus b = (Bus) v;
        b.run();
        b.checkFare();
    }
}
