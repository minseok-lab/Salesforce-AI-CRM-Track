package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 객체 생성 및 자동 타입 변환
        Parent parent = new Child();

        // Parent 타입으로 필드와 메소드 적용
        parent.field1 = "field1";
        parent.method1();
        parent.method2();
        /*
         * parent.field2 = "data2";
         * parent.method3();
         */

        // 강제 타입 변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메소드 적용
        child.field2 = "field2";
        child.method3();

        // 강제 타입 변환, 다운캐스팅
        Child c = (Child) parent;
        c.field2 = "field2";
        c.method3();
    }
}
