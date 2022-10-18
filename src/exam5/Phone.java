package exam5;

public class Phone {

    protected  String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void talk() {
        System.out.printf("%s가 통화 중이다.\n", owner);
    }
}
