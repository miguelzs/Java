/*
 * Super interessting program to find the sum of the int numbers
 * from 1 to 10 inclusive.
 */
public class FindSum {


    public static void computeSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += i;
        System.out.println("Sum from " + start + " to " + end + " is "
            + sum);
        //return sum;
    }

    public static void main(String[] args) {
        int sum;
        int x =1;
        int y = 10;
        FindSum.computeSum(x, y);
        //System.out.println("Sum from " + x + " to " + y + " is "
        //    + computeSum(x, y));

        FindSum.computeSum(20, 30);
        //System.out.println("Sum from 20 to 30 is " + sum);

        FindSum.computeSum(50, 60);
        //System.out.println("Sum from 50 to 60 is " + sum);
    }

}
