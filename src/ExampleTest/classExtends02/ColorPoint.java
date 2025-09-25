package exampletest.classExtends02;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
    }

    public ColorPoint(String color) {
        this.color = color;
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y); // 부모의 다른 생성자 호출
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showPoint() {
        super.showPoint(); // 부모의 showPoint
        System.out.println("ColorPoint 생성자 호출");
        System.out.println("색상: " + color);
    }
}
