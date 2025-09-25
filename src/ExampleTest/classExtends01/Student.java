package exampletest.classExtends01;

public class Student extends Person {
    private String schoolName;

    public Student() {
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("\t" + "학교명: " + schoolName + "\t" + "Student 생성자 호출");
    }
}
