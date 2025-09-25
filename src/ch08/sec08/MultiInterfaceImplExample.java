package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();

        // RemoteControl 인터페이스 메소드 호출
        rc.turnOn();
        rc.turnOff();

        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable sr = new SmartTelevision();

        // Searchable 인터페이스 메소드 호출
        sr.search("www.naver.com");
    }
}
