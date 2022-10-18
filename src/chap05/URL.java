package chap05;

import java.util.Scanner;

public class URL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("URL을 입력하세요. : ");
            String s = scanner.nextLine();

            if (s.endsWith("com")) {
                System.out.println(s + "은 'com'으로 끝납니다.");
            }
            if (s.contains("java")) {
                System.out.println(s + "은 'java'를 포함합니다.");
            }
            if (s.equals("bye")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
