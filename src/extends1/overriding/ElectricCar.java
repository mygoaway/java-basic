package extends1.overriding;

public class ElectricCar extends Car {

    // 메서드 오버라이딩 : 상속받은 메서드를 자신에 맞게 변경하는 것(기능 재정의)
    // 메서드 오버라이딩 조건
    // 1. 메서드 이름
    // 2. 파라미터 타입, 순서, 개수가 동일
    // 3. 반환 타입이 동일해야 한다
    // 4. 접근 제어자 : 상위 클래스의 메서드보다 더 제한적이어서는 안된다.
    // 5. 예외 : 부모보다 더 많은 예외를 선언할 수 없다.
    // 6. static, final, private 이 붙은 메서드는 메서드 오버라이딩이 불가하다.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다");
    }
}
