public class CarADriver {
    public static void main(String[] args) {
        CarA c1; // pointing to null
        c1 = new CarA();
        System.out.println(c1.getMake());

        c1.setMake("nissan");
        System.out.println(c1.getMake());

        System.out.println(c1.drive(20));

    }
}