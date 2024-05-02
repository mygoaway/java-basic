package ref;

public class Method2 {
    public static void main(String[] args) {
        printStudent(createStudent("이광재", 37, 1));
    }

    // 객체의 생성과 초기화 설정 모두 처리
    private static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 지역 변수 => 지역 변수는 수동 초기화를 직접 해야 한다.
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    // 전달한 학생 객체의 필드 값을 읽어서 출력
    private static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
