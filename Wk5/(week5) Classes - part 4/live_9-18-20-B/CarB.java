/**
 * We want to have instance data of: make, model, year, speed, hp, mpg
 * and methods to drive, break, turn
 * Encapsulation: the object is responsible for it's own data
 * and should protect it from outsider's use.
 * --> We don't want outsiders to modify our instance data (without us knowing).
 More on this coming...
 *
 */
public class CarB {
    private String make; //null
    private String model; //null
    private int year; //0
    private double speed; //0.0
    private int hp; //0
    private double mpg; //0.0
    private int numDrives = 0;
    public static final int WHEELS = 4;

    public CarB() {
        //I had initally been re-declaring the variable instead of using the this keyword (or nothing), oops... the below is now correct.
        // modified 9/16: to add constuctor chaining
        this("Unknown", "Unknown");
        //this.make = "Unknown";
        //this.model = "Unknown";
        this.year = 2020;
        this.speed = 30.0;
        this.hp = 250;
        this.mpg = 30.0;
        this.numDrives =0;
    }

    public CarB(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /* added 9/18/20 copy constructor*/
    public CarB(CarB anotherCar) {
        this.make = anotherCar.make;
        this.model = anotherCar.model;
        this.year = anotherCar.year;
        this.speed = anotherCar.speed;
        // you should copy all fields...
    }

    //accessor/getter
    public String getMake() {
        if(make == null)
            return "Unknown";
        return make;
    }

    //mutator/setter
    public void setMake(String make) {
        if(make != null)
            this.make = make;
    }

    public double drive(int time) {
        return drive(time, this.speed);

    }
    public double drive(int time, double speed) {
        // the value passed into the speed parm. is assigned to the formal speed param. varible. NOT to the object's speed varible
        //speed = speed;
        //this - reserved word used inside of methods to refer to the object upon which the method was invoked.
        //<the calling obj>.speed
        this.numDrives++;
        if(numDrives>100)
            rotateTires();
        this.speed = speed;
        double dist;
        dist = time * this.speed;
        return dist;

    }
    public static void main(String[] args) {
        CarB c1 = new CarB();
        //System.out.println(c1.make);
        //System.out.println(c1.model);
        //System.out.println(c1.year);
        //System.out.println(c1.speed);
        System.out.println(c1);
        CarB c2 = new CarB("Ford", "F150");
        //System.out.println(c2.make);
        //System.out.println(c2.model);
        //System.out.println(c2.year);
        //System.out.println(c2.speed);
        System.out.println(c2);

        System.out.println("someString".equals("String"));

        CarB c3 = new CarB();
        System.out.println(c1 == c3);

        System.out.println(c1.equals(c3));

        //added 9/18/20
        CarB c4 = new CarB(c2);
    }

    private void rotateTires() {
        // rotates the tires
    }

    /* Added toString and equals in 9/16 lecture
    */
    public String toString() {
        return "Make: " + make + "\nModel: " + model;
    }

    public boolean equals(CarB car2) {
        //You should be comparing all fields, this is shortened for time
        return this.make.equals(car2.make)
            && this.model.equals(car2.model);
    }


}
