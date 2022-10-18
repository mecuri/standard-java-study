package question;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해주세요 : ");
        int num = scanner.nextInt();

        table(num);

    }

    public static void table(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

}

