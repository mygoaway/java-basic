package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NPE 예외 발생, data 참조형 변수에는 null 값이 들어가 있음
        System.out.println("data.value = " + data.value);
    }
}
