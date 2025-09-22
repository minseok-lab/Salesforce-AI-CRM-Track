package ch06.sec03;

public class GoodsApp {
    public static void main(String[] args) {
        // 상품이름 : "nikon", 가격 : 400,000
        Goods g = new Goods();

        // goods 값 세팅
        g.name = "nikon"; // Goods.name과 같이 직접 접근 불가능
        g.price = 400000;

        // goods 값 출력
        System.out.println("상품명 : " + g.name);
        System.out.println("가격 : " + g.price);
    }
}
