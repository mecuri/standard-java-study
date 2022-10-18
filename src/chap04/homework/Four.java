package chap04.homework;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        /*
        * 키보드에서 URL을 입력받은 후 'com'으로 끝나는지, 'java'를 포함하는지 조사하는 프로그램 작성
        * 'bye'를 입력하면 프로그램 종료
        * */

        String c = "com";
        String j = "java";
        String b = "bye";

        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.print("URL을 입력하세요 : ");
            String url = in.nextLine();

            if (url.endsWith(c)) {
                System.out.printf("%s은 'com'으로 끝납니다.\n", url);
            }
            if (url.contains(j)) {
                System.out.printf("%s은 'java'를 포함합니다.\n", url);
            }
            if (url.contains(b)) {
              break;
            }
        }
    }
}
