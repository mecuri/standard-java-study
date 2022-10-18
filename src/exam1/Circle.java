package exam1;

public class Circle {

    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void show() {
        System.out.printf("반지름이 %d인 원이다.\n", radius);
    }
}
