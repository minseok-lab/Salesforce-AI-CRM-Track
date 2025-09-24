package practice.week02;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 23);

        System.out.println(p1);
        p1.draw();
        p2.draw();

        p1.setX(10);
        p1.setY(20);
        p1.draw();
        p1.draw(true);
        p1.draw();



        Point p3 = new Point();
        p3.setX(1);
        p3.setY(2);
        p3.draw();
        p3.draw(false);

    }
}
