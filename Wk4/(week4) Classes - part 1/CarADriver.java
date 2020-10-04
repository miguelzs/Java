public class CarADriver {
    public static void main(String[] args) {
        CarA c1 = new CarA();
        System.out.println(c1.make);

        c1.make = "nissan";
        System.out.println(c1.make);

        System.out.println(c1.drive(20));

    }
}
