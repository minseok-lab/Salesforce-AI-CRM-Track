package homework.week02;

public class ElectricGoods extends Goods {
    private String color;

    public ElectricGoods(String name, int price, String color) {
        super(name, price);
        this.color = color;
        System.out.println("자식 클래스의 생성자를 호출합니다.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo() {
        super.showInfo();
    }
}
