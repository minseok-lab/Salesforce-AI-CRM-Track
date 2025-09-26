package practice.week02.problem04;

public class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
    }

    @Override
    public void fly() {
        System.out.println("오리(" + getName() + ")가 날지 않습니다.");
    }
    
    @Override
    public void showName() {
        System.out.println("오리의 이름은 " + getName() + " 입니다.");
    }

}
