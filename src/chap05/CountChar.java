package chap05;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        int i = countChar("abcededsadas", 'a');
        System.out.println(i);
    }

    static int countChar(String s, char c) {
        int count = 0;
        for(int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
