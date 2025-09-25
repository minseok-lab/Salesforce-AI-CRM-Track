package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("----");

        // 추상 클래스를 매개변수로 한 메소드 호출
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
