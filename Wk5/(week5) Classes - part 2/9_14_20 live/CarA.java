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
        //added this after class:
        make = "Ford";
        model = "F150";
        year = 2020 ;
        speed = 30.0;
        hp = 350;
        mpg = 30;
    }
    CarA(String make, String model) {
        this.make = make;
        this.model = model;
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
    public static void main(String[] args) {
        CarA c1 = new CarA();
        String a = null;
        //c1.testMethod(a);
        System.out.println(c1.speed);
        CarA c2 = new CarA("BMW", "some model");
    }

    private void rotateTires() {
        //...
    }
}
