package chap05;

import java.util.Scanner;

public class Chall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //학생 수 입력
        int numOfStudents;
        System.out.print("학생 수? ");
        numOfStudents = scanner.nextInt();

        int[] scores = new int [numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i : scores) {
            System.out.print(i + " \n");
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 90) {
                System.out.println((i + 1) + "번 학생의 등급은 " + Rating.A + "입니다.");
            } else if (scores[i] > 80) {
                System.out.println((i + 1) + "번 학생의 등급은 " + Rating.B + "B입니다.");
            } else if (scores[i] > 70) {
                System.out.println((i + 1) + "번 학생의 등급은 " + Rating.C + "입니다.");
            } else if (scores[i] > 60) {
                System.out.println((i + 1) + "번 학생의 등급은 " + Rating.D + "입니다.");
            } else {
                System.out.println((i + 1) + "번 학생의 등급은 " + Rating.F + "입니다.");
            }
        }
    }
}
