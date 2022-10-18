package question;

public class Question8 {
    public static void main(String[] args) {

        int money = (int)(Math.random() * 500) * 10;
        int minMoney = money;

        int cnt500 = minMoney / 500;
        minMoney -= 500 * cnt500;
        int cnt50 = minMoney / 50;
        minMoney -= 50 * cnt50;
        int cnt10 = minMoney / 10;


        System.out.printf("%d %d %d %d\n", money, cnt500, cnt50, cnt10);


    }
}
