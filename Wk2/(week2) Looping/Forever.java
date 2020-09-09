//********************************************************************
//  Forever.java       Author: Stasko
//
//  Demonstrates the use of a while loop in a not so hot manner
//
// ********************************************************************

public class Forever {
    public static void main(String[] args) {
        int sum = 0, item = 1;
        while (item != -1) {  // sentinel value of 0 to terminate loop
            item++;

            sum += item;
            System.out.println("The sum so far is " + sum);
        }

        System.out.println();
    }
}
