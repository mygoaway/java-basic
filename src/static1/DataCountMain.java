package static1;

public class DataCountMain {
    public static void main(String[] args) {
        Data1 dataA = new Data1("A");
        System.out.println("A count = " + dataA.count);
        System.out.println(dataA);

        Data1 dataB = new Data1("B");
        System.out.println("B count = " + dataB.count);
        System.out.println(dataB);
    }
}
