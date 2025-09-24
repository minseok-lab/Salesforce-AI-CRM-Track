package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // 스마트폰 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        // SmartPhone의 필드 읽기
        System.out.println("와이파이 상태: " + myPhone.wifi);

        // 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("안녕하세요");
        myPhone.receiveVoice("안녕하세요");
        myPhone.sendVoice("아 네 괜찮습니다");
        myPhone.hangUp();

        // 스마트폰의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
