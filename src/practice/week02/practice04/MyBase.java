package practice.week02.practice04;

public class MyBase extends Base{

    public void afternoon() {
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }

    @Override
    public void service(String state) {
        if (state.equals("오후")) {
            afternoon();
        } else if (state.equals("낮")) {
            System.out.println("낮에는 열심히 일하자");
        } else {
            night();
        }
    }
}
