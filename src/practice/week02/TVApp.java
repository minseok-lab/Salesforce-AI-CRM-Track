package practice.week02;

public class TVApp {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.status();

        tv.power(true);
        tv.volume(100);
        tv.status();

        tv.volume(true);
        tv.channel(0);
        tv.status();

        tv.channel(2);
        tv.volume(0);
        tv.channel(false);
        tv.channel(false);
        tv.status();

        tv.power(false);
        tv.status();
    }
}
