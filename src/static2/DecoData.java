package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static은 static에만 접근이 가능하다. 인스턴스 메서드/멤버 변수에 접근 불가
    public static void staticCall() {
        //instanceValue++; // 인스턴스 변수 접근 => 컴파일 에러
        //instanceMethod(); // 인스턴스 메서드 접근 => 컴파일 에러

        staticValue++; // 정적 변수 접근
        staticMethod();
    }

    // 인스턴스 메서드는 인스턴스 메서드/멤버 변수 뿐만 아니라 static이 붙은 메서드와 변수 둘다 접근 가능
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticValue=" + staticValue);

    }
}
