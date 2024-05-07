package poly.basic;


public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child child) { // 자바 16부터는 인스턴스 타입 확인하면서 변수 선언이 가능해짐.
            System.out.println("Child 인스턴스 맞음");
            child.parentMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
