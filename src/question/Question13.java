package question;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문장을 입력해주세요 : ");
        String anything = scanner.nextLine();

        int num = 0;

        for (int i = 0; i < anything.length(); i++) {
            if(anything.charAt(i) == 'a'){
                num++;
            }
        }

        System.out.println("'a'의 개수 : " + num);

    }
}
