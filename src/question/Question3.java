package question;

public class Question3 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 2;
        int sum = 0;

        if(n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                sum += i;
            }
        }
        if(n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                sum += i;
            }
        }
        System.out.println("n1과 n2 사이의 합 : " + sum);
    }
}
