package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1; // 1. 변수 선언
        student1 = new Student(); // 2. 객체(인스턴스) 생성 및 3. 객체(인스턴스) 참조값을 student1 변수에 저장
        student1.name = "학생1"; // 4. 객체 값 대입 => name, age, grade
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1; // 참조값을 복사하여 저장
        students[1] = student2; // 참조값을 복사하여 저장

        // 일반적인 for문
        for(int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
        }

        // 향상된 for문
        for (Student student : students) {
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
        }
    }
}
