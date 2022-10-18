package chap06.exam;

public class BestGirl extends GoodGirl {

    String name;

    public BestGirl(String name) {
        super(name);
        this.name = name;
    }

    public void show() {
        System.out.println(name + "는 자바를 무지하게 잘 안다.");
    }
}
