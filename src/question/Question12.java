package question;

public class Question12 {
    public static void main(String[] args) {
        // [5][4]
        int[][] arr = {{5, 4, 3}, {11, 6}, {13, 9, 17, 2}, {1, 2, 3}, {7, 11, 9, 3}};
        int sum = 0;
        int length = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                length++;
            }
        }
        System.out.println(sum);
        double average = sum / (double) length;
        System.out.printf("%.2f",average);

    }
}
