package exam2;

public class Student extends Person{

    private int number;

    public int getNumber() {
        return number;
    }

    public Student(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    public void show() {
        System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", getName(), getAge(), number);
    }
}
