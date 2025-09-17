package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        // int y = 10;
        // int z;

        x++;
        ++x;
        System.out.println("X : " + ++x); // x = 13
        System.out.println("X : " + x++); // x = 13
        System.out.println("X : " + x); // x = 14

        int a = -100;
        a = -a;
        System.out.println("a : " + a);
        
        byte b = 100;
        int aa = -b;
        System.out.println("aa : " + aa);
    }
}
