package question;

public class Question6 {
    public static void main(String[] args) {

        int num = 10;
        String star = "*";

        for (int i = 0; i <= num; i++) {
            System.out.println("*");
            for (int j = 0; j <= num; j++) {
            j += i;
            }
        }
    }
}
