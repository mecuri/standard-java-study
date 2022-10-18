package chap04.homework;

public class Car {

    private static int count;
    private static int redCount;

    public Car(String color) {
        count++;
        if (color.equalsIgnoreCase("red")) {
            redCount++;
        }
    }

    public static int getNumOfCar() {
        return count;
    }

    public static int getNumOfRedCar() {
        return redCount;
    }

}
