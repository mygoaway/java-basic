package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String [] studentNames = {"학생1", "학생2"};
        int [] studentAges = {15, 90};
        int [] studentGrades = {16, 80};

        for(int i = 0; i < 2; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}
