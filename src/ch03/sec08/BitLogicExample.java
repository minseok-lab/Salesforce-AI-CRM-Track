package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("-----------------------------");

        byte num1 = 45; // 0  1  0  1 1 0 1     0010 1101
                        // 64 32 16 8 4 2 1     
        byte num2 = 25; // 0  0  1  1 0 0 1     0001 1001

        int result1 = num1 & num2; //           0000 1001
        int result2 = num1 | num2; //           0011 1101
        int result3 = num1 ^ num2; //           0011 0110


        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        byte receiveData = -120;

        // 비트 논리곱 연산으로 Unsigned 정수 얻기
        int nsignedInt1 = receiveData & 255;
        System.out.println("nsignedInt1 = " + nsignedInt1);

        // 자바 API를 이용해서 Unsigned 정수 얻기
        int nsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println("nsignedInt2 = " + nsignedInt2);
        System.out.println("-----------------------------");


        int test = 136;
        byte btest = (byte)test;
        System.out.println(btest);
    }

}
