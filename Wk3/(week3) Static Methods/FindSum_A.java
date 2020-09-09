/*
 * Super interessting program to find the sum of the int numbers
 * form 1 to 10 inclusive.
 */
public class FindSum {
    public static void main(String[] args) {
        int x =1;
        int y =10;
        FindSum.sum(x,y);
        FindSum.sum(20,30);

    }

    public static void sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++)
          sum += i;

        System.out.println("Sum from " + start + " to " + end + " is " + sum);

    }

}
