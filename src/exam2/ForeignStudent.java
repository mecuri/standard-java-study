package exam2;

public class ForeignStudent extends Student {

    private String  nation;

    public String getNation() {
        return nation;
    }

    public ForeignStudent(String name, int age, int number, String nation) {
        super(name, age, number);
        this.nation = nation;
    }

    public void show() {
        System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", getName(), getAge(), getNumber(), nation);
    }
}
