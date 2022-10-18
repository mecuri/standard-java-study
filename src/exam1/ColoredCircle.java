package exam1;

public class ColoredCircle extends Circle{

    String color;

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }

    public void show() {
        System.out.printf("반지름이 %d인 %s 원이다.\n", radius, color);
    }
}
