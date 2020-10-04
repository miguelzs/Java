//class for main
public class DogDriver {
    public static void main(String[] args) {
        //creating objects
        Dog d1 = new Dog("John", "Husky");
        Vet v1 = new Vet("Tim");
        //calling methods
        d1.setAge(5);
        d1.visitVet();
        System.out.printf("\n\n%s\n\n%s", d1.toString(), v1.toString());
    }
}