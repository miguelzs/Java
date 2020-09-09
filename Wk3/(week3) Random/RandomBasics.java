import java.util.Random;

/**
 * Demonstrates basic functionality of the java.util.Random class
 */
public class RandomBasics {

    public static void main(String[] args) {
        Random random = new Random();

        //rando integers -> +&-
        int i = random.nextInt();
        System.out.println("i == " + i);
        // set upper bound 0 to 50-1
        i = random.nextInt(50);
        System.out.println("i == " + i);

        float f = random.nextFloat();
        System.out.println("f == " + f);

        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextLong());
    }
}
