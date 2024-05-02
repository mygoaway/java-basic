package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 1. 변수 선언
        student1 = new Student(); // 2. 객체(인스턴스) 생성 및 3. 객체(인스턴스) 참조값을 student1 변수에 저장
        student1.name = "학생1"; // 4. 객체 값 대입 => name, age, grade
        student1.age = 15;
        student1.grade = 90;
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade); // 5. 객체 값 읽기

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
