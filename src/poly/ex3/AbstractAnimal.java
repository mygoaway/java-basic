package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();
    public abstract void move();

    // 순수 추상 클래스 : 모든 메서드가 추상 메서드인 추상 클래스
    // 1. 인스턴스를 생성할 수 없다
    // 2. 상속시 자식은 모든 메서드를 오버라이딩 해야 한다
    // 3. 주로 다형성을 위해 사용한다
}
