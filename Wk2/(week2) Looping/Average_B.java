import java.util.Scanner;
public class Average_B {
    public static void main(String[] args) {
        int sum=0;
        int value =0;
        int count = 0;
        double average;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int (0 to quit):");
        value = scan.nextInt();
        while(value !=0) {
            if(value < 0)
                break;
            count++;
            sum+=value;
            System.out.println("Enter an int (0 to quit):");
            value = scan.nextInt();

        }
        average = (double)sum/count;
        System.out.println(average);
    }

}