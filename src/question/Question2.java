package question;

public class Question2 {
    public static void main(String[] args) {

        // 변수 n에 정수값 저장
        int n = 5;
        int sum = 0;

        // 1부터 입력받은 정수 n까지의 합 계산
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
