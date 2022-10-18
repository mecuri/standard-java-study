package exam5;

public class Smartphone extends Telephone {

    private String game;

    public String getGame() {
        return game;
    }

    public Smartphone(String owner, String when, String game) {
        super(owner, when);
        this.game = game;
    }

    public void playGame() {
        System.out.printf("%s가 %s 게임을 하는 중이다.", owner, getGame());
    }

}
