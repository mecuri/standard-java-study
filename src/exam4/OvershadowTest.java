package exam4;

public class OvershadowTest {
    public static void main(String[] args) {

        Parent p = new Child();
        System.out.println(p.name);
    }
}
