import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myInt = scan.nextInt();

        // Print out the number
        System.out.println("The number is " + myInt);

        if (myInt < 10) {
            if(myInt == 0)
                myInt += 1;
            myInt = myInt * 2;
        } else if (myInt % 2 == 0) { //even number
            myInt = myInt / 2;
        } else {
            myInt +=10;
        }

        System.out.println("resulting myInt == " + myInt);
    }
}