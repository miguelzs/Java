//class defines object Dog
public class Dog {
//variables
    private String name; //name of the dog
    private String type; //race of the dog
    private int age; //age of the dog
    private int visitCounter; //times the dog visited vet
//constructors
    //4-args (main)
    public Dog (String name, String type, int age, int visitCounter) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.visitCounter = visitCounter;
    }
    //2-args (chained)
    public Dog (String name, String type) {
        this(name, type, 3, 2);
    }
//setters/ mutators
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setVisitCounter(int visitCounter) {
        if (visitCounter > 0)
            this.visitCounter = visitCounter;
    }
//getters/ accessors
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getVisitCounter() {
        return visitCounter;
    }
    public String getType() {
        return type;
    }
//methods
    //toString method
    public String toString() {
        if (visitCounter > 0)
            return "I am a " + type + " named " + name + " and I am " + age + " years old. I have visited the vet before " + visitCounter + " times.";
        else
            return "I am a " + type + " named " + name + " and I am " + age + " years old. I have never visited the vet before.";
    }
    //equals method
    public boolean equals(Dog other) {
        return this.visitCounter == other.visitCounter && this.age == other.age && this.type == other.type && this.name == other.name;
    }
    //visitVet method
    public void visitVet() {
        if (this.visitCounter == 0)
            System.out.print("This is my first visit and I am a little scared!");
        else
            System.out.print("I have been here " + this.visitCounter + " times");
    }
}