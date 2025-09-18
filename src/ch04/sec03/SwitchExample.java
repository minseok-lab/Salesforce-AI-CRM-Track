package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("num은 1입니다.");
                break;
            case 2:
                System.out.println("num은 2입니다.");
                break;
            case 3:
                System.out.println("num은 3입니다.");
                break;
            case 4:
                System.out.println("num은 4입니다.");
                break;
            case 5:
                System.out.println("num은 5입니다.");
                break;
            case 6:
                System.out.println("num은 6입니다.");
                break;
        }
    }

}
