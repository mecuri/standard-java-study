package chap04.homework;

public class TriangleTest {

    public static void main(String[] args) {

        /** 1.
         * 삼각형을 나타내는 Triangle 클래스를 작성하라.
         * 삼각형의 속성으로는 실숫값의 밑변과 높이를, 동작으로는 넓이 구하기와 접근자가 있고 생성자도 포함한다.
         * 작성한 클래스를 다음 코드를 사용해 테스트하라.
         */

        Triangle t = new Triangle(10.0, 5.0);
        System.out.println(t.findArea());


        /** 2.
         *  위에서 작성한 Triangle 클래스에 2개의 삼각형 넓이가 동일한지 비교하는 isSameArea() 메서드를 추가하라.
         *  그리고 다음 코드를 사용해 테스트해라.
         */
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

    }

}
