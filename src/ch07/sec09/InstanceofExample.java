package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();

        if (person instanceof Student) {
            // Student 객체일 경우 강제 타입 변환
            Student student = (Student) person;
            // Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        // Person 객체 생성
        Person person = new Person("홍길동");
        personInfo(person);

        System.out.println();

        // Student 객체를 매개값으로 제공
        Person person2 = new Student("김길동", 10);
        personInfo(person2);
    }
}
