public class Vet {
//variables
    private String name;
    private Dog regularDog;
    private int petsSeen;
    private static int officeVisits;
//constructors
    //3-args (main)
    public Vet(String vetName, Dog regularDog, int petsSeen) {
        this.name = vetName;
        this.petsSeen = petsSeen;
        this.regularDog = regularDog;
    }
    //1-arg
    public Vet(String vetName){
        this(vetName, null, 0);
    }
    //no arg
    public Vet(){
        this("James Herriot", null, 2);
    }
//methods
    //toString method
    public String toString() {
        if (regularDog == null)
            return "Hello, I am " + name + " and I have worked with " + petsSeen + " pets.";
        else {
            return "Hello, I am " + name + " and I have worked with " + petsSeen + " pets." +
                    " I have a regular dog that comes to me named " + regularDog + ".";
        }
    }
    //equals method
    public boolean equals(Vet other) {
        return this.regularDog == other.regularDog && this.petsSeen == other.petsSeen &&
                this.name == other.name;
    }
    //vetVisit method
    public void vetVisit(Dog customer){
        if (regularDog == null)
            regularDog = customer;
        customer.visitVet();
        officeVisits += 1;
        petsSeen += 1;
        System.out.print ("A vet named " + name + " treated " + customer.getName() + " today.");
    }
//accessors
    public static int getOfficeVisits() {
        return officeVisits;
    }
    public int getPetsSeen() {
        return petsSeen;
    }
    public String getName() {
        return name;
    }
    public Dog getRegularDog() {
        return regularDog;
    }
//mutators
    public void setName(String name) {
        this.name = name;
    }
    public static void setOfficeVisits(int officeVisits) {
        if (officeVisits > 0)
            Vet.officeVisits = officeVisits;
    }
    public void setPetsSeen(int petsSeen) {
        if (petsSeen > 0)
            this.petsSeen = petsSeen;
    }
    public void setRegularDog(Dog regularDog) {
        this.regularDog = regularDog;
    }
}