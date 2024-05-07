package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent1 = (Parent) child; // 업 캐스팅(자식 -> 부모)경우, 생략 가능(권장 함)
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
