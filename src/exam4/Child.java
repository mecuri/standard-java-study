package exam4;

public class Child extends Parent{

    String name = "사도세자";

    public Child() {
        this.name = name;
    }

    public void print() {
        System.out.printf("나는 %s이다.", name);
    }
}
