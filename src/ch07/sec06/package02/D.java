package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class D extends A {
    // 생성자 선언
    public D() {
        super();
    }

    // 메소드 선언
    public void method1() {
        this.field = "field";
        this.method();
    }

    // 메소드 선언 불가
    /*
    public void method2() {
        A a = new A();
        a.field = "field";
        a.method();
    }
    */

}
