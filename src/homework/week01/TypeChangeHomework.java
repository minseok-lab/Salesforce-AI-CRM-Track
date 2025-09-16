package homework.week01;

public class TypeChangeHomework {
    public static void main(String[] args) {
        // 2025.09.16 과제
        // 자동 타입 변환 (ch02.sec07.PromotionExample.java)

        // 강제 타입 변환
        // int -> byte
        int intValue = 50;
        byte byteValue = (byte) intValue;
        System.out.println("byteValue = " + byteValue);

        int intValue2 = 128;
        byte byteValue2 = (byte) intValue2;
        System.out.println("byteValue2 = " + byteValue2);
    }

}
