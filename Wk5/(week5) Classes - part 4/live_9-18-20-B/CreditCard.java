/**
* 1. You are given a class called CreditCard (this file).
*
* 2. Create the following instance fields:
*    - a String called name,
*    - a double called moneySpent,
     - and a boolean called inDebt.
* Set their visibility modifier as discussed in class for
* instance data to enforce encapsulation.
*
* 3. Make two constructors.
*    - One will take in 3 parameters for each of the
*      instance variables in the order listed above.
*    - The second should take in 1 parameter for name
*      and set moneySpent to 0.0 and inDebt to false.
* You should correctly implement constructor chaining.
*
* 4. Create a method called spendMoney that takes in a double called amount
* that returns nothing (void).
* This method should increase moneySpent by the amount passed in
* and set inDebt to true.
*
* 5. Implement a toString method that prints out all instance data meaningfully
* 6. Implement an equals method that will compare 2 CreditCard objects
*    base don their fields.
*/
public class CreditCard {

    private String name;
    private double moneySpent;


    public CreditCard(String name) {
        this.name = name;
        this. moneySpent = 0.0;
    }

    public CreditCard(CreditCard anotherCard){
        this.name = anotherCard.name;
        this.moneySpent = anotherCard.moneySpent;
    }

    public void setName(String name){
        this.name = name;

    }

    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard("mastercard 1");
        CreditCard cc2 = new CreditCard("visa 1");
        CreditCard cc3 = new CreditCard("mastercard 1");

        // these should give more useful information than the reference
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        //cc1 and cc2 are not equal
        System.out.printf("cc1 equals cc2? %b%n", cc1.equals(cc2));
        //cc1 and cc3 should be equal
        System.out.printf("cc1 equals cc3? %b%n", cc1.equals(cc3));
    }


}
