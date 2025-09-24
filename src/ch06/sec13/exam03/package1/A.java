package ch06.sec13.exam03.package1;

public class A {
    public int field1;
    int field2;
    //private int field3;

    // 생성자 선언
    public A() {
        field1 = 1;
        field2 = 1;
        //field3 = 1;

        method1();
        method2();
        method3();
    }
    // public 접근제한을 작는 메소드 선언
    public void method1() {
    }

    // dafault 접근 제한을 받는 메소드 선언
    void method2() {
    }

    // private 접근 제한을 갖는 메소드 선언
    private void method3() {
    }
}
