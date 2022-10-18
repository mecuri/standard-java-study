package chap04.homework;

public class LineTest {
    /**
     * 길이 속성만 가진 직선을 모델링한 Line 클래스를 작성하고, 다음 프로그램으로 테스트하라.
     */
    public static void main(String[] args) {

        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b)); // true
        System.out.println(a == b);          // false

    }
}
