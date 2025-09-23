package homework.week02;

public class Bread {
    // 필드선언
    private String name;
    private int price;

    // 생성자 선언
    public Bread(String n, int m) {
        name = n;
        price = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
