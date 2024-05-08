package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver1 = new Driver(new K3Car());
        Driver driver2 = new Driver(new Model3Car());

        driver1.drive();
        System.out.println();
        driver2.drive();
    }
}
