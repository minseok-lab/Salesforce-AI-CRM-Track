package homework.week02.problem02;

public class Depart extends Employee {

    private String depart;

    public Depart() {
    }

    public Depart(String depart) {
        this.depart = depart;
    }

    public Depart(String name, int salary, String depart) {
        super(name, salary);
        this.depart = depart;
    }

    @Override
    public void getInformation() {
        System.out.println("이름: " + getName() + "\t 연봉: " + getSalary() + "\t 부서: " + depart);
    }

}
