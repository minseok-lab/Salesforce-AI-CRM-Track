package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "010624-3230123";

        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
