package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student = new Student();
        initStudent(student, "이광재", 37, 1);
        printStudent(student);
    }

    // 전달한 학생 객체의 필드에 값을 설정
    private static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 전달한 학생 객체의 필드 값을 읽어서 출력
    private static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
