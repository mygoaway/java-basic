package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 1. 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 2. 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 3. 부모 변수가 자식 인스턴스 참조(다형적 참조) Parent > Child > Grandson
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 하지만, 자식 변수가 부모 인스턴스를 담을 수 없다.
        poly.parentMethod();
        // poly.childMethod(); 호출이 불가하다. Parent 타입은 childMethod()를 모르기 때문에 호출이 불가함(컴파일 오류)
    }
}
