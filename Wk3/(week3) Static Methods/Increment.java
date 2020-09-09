/**
 * Illustrates method parameter are pass by value.
 */
public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        Increment.increment(x);

        System.out.println("after the call, x is " + x);
    }

    public static void  increment(int x) {
        int y = 0;
        x++;

        System.out.println("n inside the method is " + x);
    }
}
