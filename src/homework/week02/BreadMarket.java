package homework.week02;

import java.util.Scanner;

public class BreadMarket {
    public static void main(String[] args) {

        Bread[] breads = { // 빵 종류와 그 가격의 배열을 선언합니다.
            new Bread("팥붕어빵", 700),
            new Bread("크림붕어빵", 1000),
            new Bread("호떡", 700),
            new Bread("씨앗호떡", 900),
        };

        System.out.println("구매할 빵 수량을 입력해주세요.");
        Scanner sc = new Scanner(System.in); // Scanner를 호출해 입력창을 엽니다.
        int totalPrice = 0;

        for (int i = 0; i < breads.length; i++) { // i는 0부터 배열의 길이만큼 반복합니다.
            // 입력을 위해 빵 배열에서 getName과 getPrice를 통해 종류와 가격을 불러와서 출력합니다. 
            System.out.print(breads[i].getName() + "(" + breads[i].getPrice() + "원)" + " : ");
            int count = sc.nextInt(); // 입력값은 정수입니다.

            if (count < 0) { // 음수처리를 진행합니다. (0으로 간주)
                System.out.println("잘못된 입력입니다. 0으로 간주합니다.");
                count = 0;
            }

            int linePrice = breads[i].getPrice() * count; // 각 빵 별 가격은 빵의 가격을 가져오고, 입력한 수와 곱합니다.
            totalPrice += linePrice; // 총액은 각 i번째 빵을 계산한 금액의 합
        }
        
        System.out.println("총 가격 : " + totalPrice + "원 입니다");
        sc.close();
    }
}
