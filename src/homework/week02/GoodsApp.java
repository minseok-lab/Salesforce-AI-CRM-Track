package homework.week02;

public class GoodsApp {
    public static void main(String[] args) {
        Goods good1 = new Goods("TV", 300000);
        good1.showInfo();
        System.out.println("품명 : " + good1.getName());
        System.out.println("가격 : " + good1.getPrice());

        ElectricGoods goods2 = new ElectricGoods("Phone", 200000, "blue");
        goods2.showInfo();
        System.out.println("품명: " + goods2.getName());
        System.out.println("가격: " + goods2.getPrice());
        System.out.println("색상: " + goods2.getColor());

        ElectricGoods goods3 = new ElectricGoods("Computor", 700000, "black");
        goods3.showInfo();
        System.out.println("색상: " + goods3.getColor());

        int i = 18;
        int b = 6;
        int arraylength = (i + b - 1) / b;
        System.out.println(arraylength);
        
    }
}
