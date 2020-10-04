/**
 * We want to have instance data of: make, model, year, speed, hp, mpg
 * and methods to drive, break, turn
 * Encapsulation: the object is responsible for it's own data
 * and should protect it from outsider's use.
 * --> We don't want outsiders to modify our instance data (without us knowing).
 More on this coming...
 *
 */
public class CarA {
    //modified to not assign a default value as we now have a default constructor:
    private String make; //null
    private String model; //null
    private int year; // 0
    private double speed; // 0.0
    private int hp; //0
    private double mpg; //0
    private int numDrives; //0
    public final int WHEELS = 4;

    CarA(){
        //modified 9/16/20 to use constructor chaining
        this("Ford", "F150");
        year = 2020 ;
        speed = 30.0;
        hp = 350;
        mpg = 30;

    }

    CarA(String make, String model) {
        this.make = make;
        this.model = model;
    }
    CarA(CarA car2) {
        this.make = car2.make;
        this.model = car2.model;
        this.year = car2.year;
        this.speed = car2.speed;
        //...
    }

    //getter/accessor
    public String getMake() {
        if(make==null)
            return "Unknown";
        return make;
    }
    //setter/mutator
    public void setMake(String make){
        if(make!=null)
            this.make = make;
    }

    public double drive(int time) {


        return drive(time, speed);

    }
    public double drive(int time, double speed) {
        numDrives++;
        if(numDrives > 100)
            rotateTires();
        double distance;
        this.speed = speed;
        distance = this.speed * time;

        return distance;
    }
    public void testMethod(String a) {
        System.out.println(a.length());
    }

    /* added 9/16/20
    */
    public String toString() {
        return "Make: " + make + "\nModel: " + model;
    }
    /* added 9/16/20
    */
    public boolean equals(CarA car2) {
        //you need to check all fields, this is just shortened for time
        return this.make.equals(car2.make)
            && this.model.equals(car2.model);
    }
    public static void main(String[] args) {
        CarA c1 = new CarA();
        String a = null;
        //c1.testMethod(a);
        System.out.println(c1.speed);
        CarA c2 = new CarA();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("using ==: " + (c1 == c2)); //compares the references or memory location
        //if you want to compare the fields in the class instead, then implement the equals method in your class
        System.out.println("using equals(): " + c1.equals(c2));

        //c1 = c2; // this is creating an alias, not what we want!
        c1.make = "BMW";
        System.out.println(c1);
        System.out.println(c2);

        c1 = new CarA(c2);
        System.out.println(c1);
        System.out.println(c2);
    }

    private void rotateTires() {
        //...
    }
}
