package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // 아무도 사용하지 않는 인스턴스는 메모리만 차지 => 이런 경우 JVM의 GC가 더 이상 사용하지 않는 인스턴스라 판단, 자동으로 메모리에서 제거
        Data data = null;
        System.out.println("data = " + data);

        Data data1 = new Data();
        System.out.println("data1 = " + data1);
    }
}
