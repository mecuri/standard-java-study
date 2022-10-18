package exam6;

public class Car extends Vehicle {

    private int displacement;
    private int gears;

    public int getDisplacement() {
        return displacement;
    }

    public int getGears() {
        return gears;
    }

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }

    public void show() {
        System.out.printf("자동차 색상 : %s, 자동차 속도 : %d, 자동차 배기량 : %d, 자동차 기어 단수 : %d", color, speed, displacement, gears);
    }


}
