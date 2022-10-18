package chap04.homework;

/**
 * 회원을 관리하려고 회원을 모델링한 Member 클래스를 작성하라.
 * 회원 정보로는 이름, 아이디, 암호, 나이가 있다.
 * 외부 객체는 이와 같은 회원 정보에 직접 접근할 수 없고 접근자와 생성자로만 접근할 수 있다.
 * 그리고 모든 회원 정보를 사용해 객체를 생성할 수 있는 생성자도 있다.
 */
public class Member {

    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
