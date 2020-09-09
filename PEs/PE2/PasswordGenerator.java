import java.util.Scanner;

public class PasswordGenerator{
  public static void main(String[] args){

    String password;
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a phrase that will be converted to a password:");
    password = myScanner.nextLine().toUpperCase();
    password = password.replace("A", "@");
    password = password.replace("E", "#");
    password = password.replace("I", "!");
    password = password.replace("O", "0");
    password = password.replace("U", "&");

    int size = password.length();
    if (size>=2&&size<=5){
      password = password + password;
      System.out.printf("Your password could be guessed so the length was adjusted! Your new password is %s.\n", password);
    }else if (size>=6){
      System.out.printf("Your password is the perfect length! Your password is %s.\n", password);
    }else{
      System.out.println("This password will not work. You should try again!");
    }
  }
}
