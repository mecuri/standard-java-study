package question;

public class Question1 {
    public static void main(String[] args) {

        // 각 과일의 하루 생산량
        int apple = 5;
        int pear = 6;
        int orange = 7;

        int dayF = apple + pear + orange;
        float hourF =  dayF / 24f; // 과일 / 24 ?
        // 1. 과수원에서 하루에 생산되는 과일의 총 갯수 출력
        System.out.println("하루에 생산되는 과일의 총 갯수 : " + dayF);
        // 2. 시간당 과일의 생산 갯수 출력
        System.out.println("시간당 과일의 생산 갯수 : " + hourF);
    }


}
