package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성을 막는다. => 정적 메서드만 사용하는 클래스의 경우에는 생성자를 private로 막자.
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if( i < min ) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if( i > max ) {
                max = i;
            }
        }
        return max;
    }
}
