package poly.diamond;

// 인터페이스는 다중 구현이 가능하다.
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
