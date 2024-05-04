package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println("s = " + s);

        String result = DecoUtil2.deco(s);
        System.out.println("result = " + result);
    }
}
