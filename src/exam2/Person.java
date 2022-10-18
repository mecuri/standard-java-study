package exam2;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
    }
}
