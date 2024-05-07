package poly.ex4;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal(); // 컴파일 에러 발생
        // 인터페이스 vs 추상클래스
        // - 인터페이스 다중 상속이 가능
        // - 제약 : 추상클래스의 경우, 몸통이 구현된 메서드를 선언할 수 있는데 해당 부분을 자식 클래스에서 놓치는 경우가 발생할 수 있다.

        InterfaceAnimal[] interfaceAnimalArr = {new Dog(), new Cat(), new Caw()};
        for (InterfaceAnimal animal : interfaceAnimalArr) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
