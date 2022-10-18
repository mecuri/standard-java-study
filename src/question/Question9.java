package question;

public class Question9 {
    public static void main(String[] args) {

        // 1 ~ 45 사이의 6개 랜덤 번호 생성
        int[] lotto = new int[6];
        // 중복 생성 X
        for (int i = 0; i < lotto.length; i++) {
            int ranNum = ((int) (Math.random() * 45) + 1);
        }

    }
}

