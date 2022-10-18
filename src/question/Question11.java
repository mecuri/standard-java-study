package question;

public class Question11 {
    public static void main(String[] args) {
        char[][] ch = {{'A', 'B'},{'C', 'D', 'E'},{'F'}};


        for(int i = 0; i < ch.length; i++) {
            for(int j = 0; j < ch[i].length; j++) {
                System.out.printf("%s ", ch[i][j]);
            }
            System.out.println();
        }
    }
}
