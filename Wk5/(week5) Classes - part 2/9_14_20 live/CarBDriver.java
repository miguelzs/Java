public class CarBDriver {
    public static void main(String[] args) {
        CarB c1 = new CarB();
        System.out.println(c1.getMake());
        //System.out.println(c1.model);
        //System.out.println(c1.year);
        //System.out.println(c1.speed);
        //c1.make = "toyota";
        c1.setMake("toyota");
        //c1.year = 2014;
        //c1.speed = 35.0;
        System.out.println(c1.getMake());
        //System.out.println(c1.model);
        //System.out.println(c1.year);
        //System.out.println(c1.speed);
        CarB c2 = new CarB();
        System.out.println(c2.getMake());
        //System.out.println(c2.model);
        //System.out.println(c2.year);
        //System.out.println(c2.speed);

        //System.out.println(CarB.speed);

        //<the calling obj.>.method()

        System.out.println(c1.drive(20));

        System.out.println(c1.drive(20, 60));
    }
}