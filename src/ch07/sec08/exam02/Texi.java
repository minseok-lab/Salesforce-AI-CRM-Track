package ch07.sec08.exam02;

public class Texi extends Vehicle {
    // 메소드 재정의(오버라이드)
    @Override
    public void run() {
        System.out.println("택시가 달린다.");
    }
}
