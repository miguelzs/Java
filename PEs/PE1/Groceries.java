// I worked on the homework assignment alone, using only course materials.

public class Groceries{
  public static void main(String[] args){
    String name;
    int cash;
    double taxRate;
    double subtotal;
    double change;

    name = new String ("Brad");
    cash = 50;
    taxRate = 0.1;
    subtotal = 42.3;
    change = cash-subtotal*(1+taxRate);
    System.out.printf("%s has $%.2f dollars remaining!\n%s started with $%d dollars!", name, change, name, cash);
  }
}
