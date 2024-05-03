package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 매개 변수가 없는 생성자 => 기본 생성자
    // 클래스에 생성자가 하나도 없으면 자바 컴파일러는 기본적으로 기본 생성자를 만들어 준다.
    // 단, 개발자가 별도의 생성자 코드를 작성한 경우 기본 생성자를 만들지 않는다.
    public MemberInit() {
    }

    void initMember(String name, int age, int grade) {
        // this는 자기 자신의 인스턴스
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
