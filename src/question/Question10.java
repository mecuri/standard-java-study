package question;

import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {

        char[][] ch = new char[3][4];
        /*
        * o o o o
        * o o o o
        * o o o o
        * */

        char t = 'A';

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                ch[i][j] = t++;
            }
        }

        for (char[] chars : ch) {
            for (char aChar : chars) {
                System.out.printf("%s ", aChar);
            }
            System.out.println();
        }

    }
}
