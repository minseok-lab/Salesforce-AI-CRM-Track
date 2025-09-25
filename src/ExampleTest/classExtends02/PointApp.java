package exampletest.classExtends02;

public class PointApp {
    public static void main(String[] args) {
        Point p = new Point(4, 4);
        ColorPoint cp1 = new ColorPoint("red");
        ColorPoint cp2 = new ColorPoint(10, 10, "blue");

        p.showPoint();
        cp1.showPoint();
        cp2.showPoint();
    }
}
