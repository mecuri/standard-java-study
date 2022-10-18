package exam5;

public class Telephone extends Phone{

    private String when;

    public String getWhen() {
        return when;
    }

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }

    public void autoAnswering() {
        System.out.printf("%s가 없다. %s 전화 줄래.\n", owner, getWhen());
    }
}
