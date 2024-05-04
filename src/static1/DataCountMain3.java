package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 dataA = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 dataB = new Data3("B");
        System.out.println("B count = " + Data3.count);
    }
}
