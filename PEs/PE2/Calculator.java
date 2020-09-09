// I worked on the homework assignment alone, using only course materials.
import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
    //Defining variables
    String operation;
    int firstNumber;
    int secondNumber;
    int result;
    Scanner takesInput = new Scanner(System.in);
    //Scanning variables
    System.out.println("What operation would you like to perform (Addition, Multiplication, Division, or Subtraction)?");
    operation = takesInput.nextLine().toUpperCase();
    System.out.println("Enter your first number:");
    firstNumber = takesInput.nextInt();
    System.out.println("Enter your second number:");
    secondNumber = takesInput.nextInt();
    //Operations and printing
    switch (operation){
      case "ADDITION" :
        result = firstNumber+secondNumber;
        System.out.printf("We added %d and %d. The answer is %d.\n", firstNumber, secondNumber, result);
        break;
      case "MULTIPLICATION" :
        result = firstNumber*secondNumber;
        System.out.printf("Here we multiplied %d and %d. The answer is %d.\n", firstNumber, secondNumber, result);
        break;
      case "DIVISION" :
        result = firstNumber/secondNumber;
        System.out.printf("This time we divided %d and %d. The answer is %d.\n", firstNumber, secondNumber, result);
        break;
      case "SUBTRACTION" :
        result = firstNumber-secondNumber;
        System.out.printf("%d and %d were subtracted. The answer is %d.\n", firstNumber, secondNumber, result);
        break;
      default:
        System.out.println("That is not a valid operation!");
    }
  }
}
