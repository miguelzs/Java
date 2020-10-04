public class Person {
    private static int count;
    private String name;

    public Person() {
        this("No Name");
    }
    public Person(String name) {
        this.name = name;
        count++;
        System.out.println("name == " + name);
        System.out.println("count == " + count);
    }

    public void talk() {
        //what can you access and do inside this method?
        System.out.println("inside Person's talk method...");
        System.out.println(name);
        System.out.println(Person.count);

        System.out.println(count);
        foo();
        Person.add();
        //think();
    }
    private void foo() {
        //do stuff

    }
    private void think() {
        // think hard
        System.out.println("inside Person's think method...");

        //then talk
        talk();
    }
    public static void add(){
        //what can be accessed and call here?
        System.out.println("inside Person's static add method...");
        //System.out.println(name);
        //think();
        Person.someMethod();
    }
    public static void someMethod() {

    }
}
