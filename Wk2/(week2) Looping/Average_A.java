import java.util.Scanner;
/*
*/
public class Average_A {

    public static void main(String[] args) {
         int sum = 0;
         int value = 0;
         int count = 0;
         double average;
         Scanner scan = new Scanner(System.in);
         //System.out.println("enter an int (0 to quit program):");
         //value = scan.nextInt();
        do {
            System.out.println("enter an int (0 to quit program):");
            value = scan.nextInt();
            count++;
            sum += value;

            if(value < 0)
                break;


         } while( value != 0 );
         average = (double)sum/count;

         System.out.println(average);
    }
}