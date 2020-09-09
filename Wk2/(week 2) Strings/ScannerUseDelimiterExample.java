import java.util.Scanner;
/* modified from: https://www.javatpoint.com/post/java-scanner-usedelimiter-method
*/
public class ScannerUseDelimiterExample {
     public static void main(String args[]){
        //Create scanner with the specified String Object
        Scanner scanner = new Scanner(System.in);
        //Print String
        System.out.println("String: " + scanner.nextLine());
        //Change the delimiter of this scanner
        scanner.useDelimiter(";"); // user still has to hit the enter key to submit the input
        //Display the new delimiter
        System.out.println("New delimiter: " + scanner.delimiter());
        String input = scanner.next(); // only gets the first token not the whole line
        System.out.println("input = " + input);
    }
}