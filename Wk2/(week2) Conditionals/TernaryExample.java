/**
 * A ternary operator or conditional operator is
 * a shorthand version of an if/else conditional
 * syntax:
*   boolean-expression ? true=expression : false-expression;
 */
public class TernaryExample {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        // Let's convert this to a ternary expression
        // HINT: in python this would be something like:
        // print("sorted") if  (x < y && y < z) else print("not sorted")
        if (x < y && y < z) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }

        /*
        // boolean-expression ? true=expression : false-expression;
        String output = (x < y && y < z) ? "sorted" : "not sorted";
        System.out.println(output);
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
        */

        // you wouldn't actually do this in practice
        // because the result of the boolean expression is the result of the ternary expression
        boolean someBool = (x < y && y < z) ? true : false;
        System.out.println(someBool);

        // here is a better example:
        int val1 = 2;
        int val2 = 3;
        int max = val1 >= val2 ? val1 : val2;
    }
}
