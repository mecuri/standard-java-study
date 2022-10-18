package chap04.homework;

public class Triangle {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 넓이 구하기 (1/2) * 밑변 * 높이
    public double findArea() {
        return (0.5) * base * height;
    }

    // 2개의 삼각형 넓이가 동일한지 비교하기
    public boolean isSameArea(Triangle triangle) {
        return this.findArea() == triangle.findArea();
    }

    public double getBase() {
        return this.base;
    }
}
