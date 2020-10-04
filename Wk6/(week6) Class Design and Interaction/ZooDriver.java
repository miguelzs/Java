public class ZooDriver {
    public static void main(String[] args) {
        Person p = new Person();
        Tiger t = new Tiger();
        t.roar();
        //t.go();

        p.talk();
        Person p2 = new Person("Sally");
        p2.talk();
        Person.add();
    }
}
