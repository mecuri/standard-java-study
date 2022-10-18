package exam1;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Circle color = new ColoredCircle(10,"빨간색");

        circle.show();
        color.show();
    }

}
