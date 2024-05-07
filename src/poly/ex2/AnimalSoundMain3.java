package poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        // 1. AbstractAnimal 클래스를 생성할 수 있는 문제
        // 2. AbstractAnimal 클래스의 sound 메서드를 실수로 오버라이딩 하지 않는 문제
        Animal [] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
