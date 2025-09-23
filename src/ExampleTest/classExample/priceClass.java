package exampletest.classExample;

public class priceClass {
    public static void main(String[] args) {
        Bread[] breads = new Bread[8];

        for (int i = 0; i < 3; i++) {
            breads[i] = new Bread("붕어빵" + (i + 1), 500);
        }

        for (int i = 3; i < 8; i++) {
            breads[i] = new Bread("호떡" + (i + 1), 1000);
        }

        int totalPrice = 0;
        for (int i = 0; i < breads.length; i++) {
            System.out.println(breads[i].name + " : " + breads[i].price);
            totalPrice += breads[i].price;
        }
        System.out.println("총 가격 : " + totalPrice + "원 입니다.");
    }
}
