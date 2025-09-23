package exampletest.classExample;

public class Goods {
    private String name;
    private int price;

    // private로 선언한 Goods 클래스를 public으로 전환합니다.
    public Goods() {
    }

    // Goods 메서드를 정의합니다.
    // ( , ) 괄호 안의 두 인자는 문자열 name과 정수 가격입니다.
    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    // getName을 통해 이름을 가져옵니다.
    public String getName() {
        return name;
    }

    // setName을 통해 이름을 정의합니다.
    public void setName(String name) {
        this.name = name;
    }
    
    // getPrice를 통해 이름을 가져옵니다.
    public int getPrice() {
        return price;
    }

    // getPrice를 통해 가격을 정의합니다.
    public void setPrice(int price) {
        this.price = price;
    }
    
    // 출력값(return)을 덮어씁니다.
    @Override
    public String toString() {
        return "Goods [name = " + name + ", price = " + price + "]";
    }
}
