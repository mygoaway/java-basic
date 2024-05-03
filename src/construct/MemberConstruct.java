package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    public MemberConstruct(String name, int age) {
        this(name, age, 50); // this()는 생성자 코드의 첫줄에만 작성할 수 있다.
    }

    public MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
    }
}
