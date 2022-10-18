package chap05;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("10개의 숫자를 입력하세요.");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 100 ; i += 10) {


            String star = "";
            for (int num : arr) {
                if (i <= num && i + 9 > num) {
                    star += "*";
                }
            }
            System.out.printf("%d ~ %d : %s\n", i, i + 9, star);
        }



    }
}
