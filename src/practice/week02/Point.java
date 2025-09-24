package practice.week02;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int setX(int x) {
        this.x = x;
        return x;
    }

    public int getY() {
        return y;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    @Override
    public String toString() {
        return "Point [ x = " + x + ", y = " + y + " ]";
    }

    public void draw() {
        System.out.println("점 [ x = " + x + ", y = " + y + " ]을 그렸습니다.");
    }
    
    public void draw(boolean doit) {
        if (doit) {
            System.out.println("점 [ x = \" + x + \", y = \" + y + \" ]을 지웠습니다.");
            this.x = 0;
            this.y = 0;
        }
    }
}
