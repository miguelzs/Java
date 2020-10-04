public class VarArgsDemo {
  public static void main(String[] args) {
    printMax("Hello", 34, 3, 3, 2, 56.5);
    printMax("hello", 1, 2, 3);
    printMax("hello", new double[]{1, 2, 3});
  }

  public static void printMax(String a, double... numbers) {
    if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
    }

    double result = numbers[0];

    for (int i = 1; i < numbers.length; i++)
      if (numbers[i] > result)
        result = numbers[i];

    System.out.println("The max value is " + result);
  }
}
