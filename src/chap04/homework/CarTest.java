package chap04.homework;

public class CarTest {
    /**
     * 생산된 모든 자동차와 빨간색 자동차의 개수를 출력하는 Car클래스를 작성하라.
     * 그리고 다음 코드를 사용해 테스트하라.
     * 의도: static 인점, 문자열이 대소문자가 달라도..
     */
    public static void main(String[] args) {
        new Car("red");
        new Car("blue");
        new Car("RED");

        System.out.printf("자동차수 : %d, 빨간색 자동차 수 : %d",
                Car.getNumOfCar(),
                Car.getNumOfRedCar());
    }
}
