//In order to help learn course concepts, I consulted related material that can be
//found at https://www.geeksforgeeks.org/java-math-random-method-examples/#:~:text=random()%20method%20returns%20a,util.

//Example given in the website:
/*
Java program to demonstrate working
of java.lang.Math.random() method
import java.lang.Math;

class Gfg2 {

    // driver code
    public static void main(String args[])
    {
        // define the range
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;

            // Output is different everytime this code is executed
            System.out.println(rand);
        }
    }
}
*/

//My code:

//Importing required packages
import java.util.Random;

//Defining class
public class RandomPrinter{

  //Defining Main method
  public static void main(String[] args){
    //Creating object
    Random gen = new Random();
    RandomPrinter.randomController(gen);
}

  //Defining 1st method: powersOfTwo
  public static void powersOfTwo(){
    System.out.println("Running the powersOfTwo method");
    int counter = 0;
    //calculating all powers of two
    while ((int) Math.pow(2, counter)<100){
      System.out.printf("    2 raised to the %d is %d\n", counter, (int) Math.pow(2, counter));
      counter += 1;
    }
  }

  //Defining 2nd method: parameterPrinter
  public static void parameterPrinter(int parameter){
    System.out.println("Running the parameterPrinter method");
    System.out.printf("    Method took the parameter %d\n", parameter);
  }

  //Defining 3rd method: randomNumber
  public static void randomNumber(){
    System.out.println("Running the randomNumber method");
    int num = (int)(Math.random() * 10) + 1;
    System.out.printf("    Your random number is %d\n", num);
  }

  //Defining 4th method: randomController
  public static void randomController(Random rand){
    System.out.println("Starting to call the methods!");
    int counter;
    int j;
    //Calling object to generate random number for method #1
    counter = rand.nextInt(5)+1;
    for (j=0; j<counter; j++){
      RandomPrinter.powersOfTwo();
    }

    //Calling object to generate random number for method #2
    counter = rand.nextInt(5)+5;
    for (j=0; j<counter; j++){
      RandomPrinter.parameterPrinter(counter);
    }

    //Calling object to generate random number for method #3
    counter = rand.nextInt(10)+1;
    for (j=0; j<counter; j++){
      RandomPrinter.randomNumber();
    }
  }
}
