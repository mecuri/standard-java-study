package question;

public class Question5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            for (int j = 1; j < i ; j++) {
                System.out.printf("%d %d", i, j);
            }
        }
    }
}
