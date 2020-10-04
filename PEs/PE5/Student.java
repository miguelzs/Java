//I worked on the homework assignment alone, using only course materials.

public class Student {

    private final String name;
    private int gtid;
    private int classYear;
    private double gpa;
    private double diningDollar;
    private double buzzfund;

    //Constructors
    //Complete constructor
    public Student(String name, int gtid, int classYear, double gpa, double diningDollar, double buzzfund) {
        if (classYear < 1 | classYear > 4) { //check if values are plausible
            classYear = 1;
        }
        if (gpa < 0 | gpa > 4) {
            gpa = 4;
        }
        if (diningDollar < 0) {
            diningDollar = 0;
        }
        if (buzzfund < 0) {
            buzzfund = 0;
        }
        this.name = name;
        this.gtid = gtid;
        this.classYear = classYear;
        this.gpa = gpa;
        this.diningDollar = diningDollar;
        this.buzzfund = buzzfund;
    }
    //Chained constructors
    public Student(String name) {
        this(name, -1, 1, 4, 0, 0);
    }
    public Student(String name, int gtid, int classYear) {
        this(name, gtid, classYear, 4, 0, 0);
    }
    public Student(String name, double diningDollar, double buzzfund) {
        this(name, -1, 1, 4, diningDollar, buzzfund);
    }
    //method for purchasig a meal, it will remove money from DD or BF
    public void purchaseMeal(double cost) {
        if (diningDollar + buzzfund < cost) {
            System.out.println(name + "does not have enough funds to purchase the meal");
        } else {
            diningDollar -= cost;
            if (diningDollar < 0) {
                buzzfund += diningDollar;
                diningDollar = 0;
            }
            System.out.println(name + "has successfully purchase the meal");
        }
    }
    //method fo radding money to diningdollar
    public void addDiningDollars(double diningDollarVal) {
        diningDollar += diningDollarVal;
    }
    //method for adding money to buzzfunds
    public void addBuzzfund(double buzzfundVal) {
        buzzfund += buzzfundVal;
    }
    //method for increasing the class year of the given object
    public void increaseClassYear() {
        classYear++;
        if (classYear > 4) {
            classYear = 4;
        }
    }
    //method for returning a string contatining the values of the student object
    public String toString() {
        return "Name: " + name + ", GTID: " + gtid + ", GPA: " + gpa + ", Class Year: " + classYear
            + ", Funds: " + (buzzfund + diningDollar);
    }
    //method for comparing two Students
    public boolean equals(Student other) {
        return this.name == (other.name) && this.gpa == (other.gpa) && this.classYear == (other.classYear);
    }
}
