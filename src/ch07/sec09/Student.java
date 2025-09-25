package ch07.sec09;

public class Student extends Person {
    // 필드 선언
    public int studentNo;

    // 생성자 선언
    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    // 메소드 선언
    public void study() {
        System.out.println(name + "이 공부합니다.");
    }
}
