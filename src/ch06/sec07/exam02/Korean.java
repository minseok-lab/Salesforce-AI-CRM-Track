package ch06.sec07.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn) {
        this.name = name; // this = 현재 클래스로부터 만들어진 객체, 클래스 내에서만 사용됨
        this.ssn = ssn;
    }
}
