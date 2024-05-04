package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println("s = " + s);

        DecoUtil1 decoUtil1 = new DecoUtil1();
        String result = decoUtil1.deco(s);
        System.out.println("result = " + result);
    }
}
