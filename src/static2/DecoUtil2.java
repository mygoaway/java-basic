package static2;

public class DecoUtil2 {
    // 정적 메서드 => 클래스의 인스턴스없이 바로 사용 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
