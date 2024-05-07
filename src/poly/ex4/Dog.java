package poly.ex4;

public class Dog implements InterfaceAnimal {
    // 추상 메서드는 반드시 오버라이딩 되어야 한다.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
