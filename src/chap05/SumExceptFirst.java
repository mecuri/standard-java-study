package chap05;

public class SumExceptFirst {

    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        System.out.println(sumExceptFirst(1, new int[] {2,3}));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    public static int sumExceptFirst(int front, int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}
