public class BirthdayCalculator {
  public static void main(String [] args){
      int birthMonth;
      int birthDay;
      int birthYear;
      int bdayCalculation;
      int twoDigits;
      birthMonth = 1;
      birthDay = 23;
      birthYear = 1996;
      bdayCalculation = birthMonth;

      bdayCalculation += 18;
      bdayCalculation *= 25;
      bdayCalculation -= 333;
      bdayCalculation *= 8;
      bdayCalculation -= 554;
      bdayCalculation /= 2;
      bdayCalculation += birthDay;
      bdayCalculation *= 5;
      bdayCalculation += 692;
      bdayCalculation *= 20;

      twoDigits = birthYear - (int)(birthYear/100)*100;
      bdayCalculation += twoDigits;
      bdayCalculation -= 32940;
      System.out.printf("Birthday: %d", bdayCalculation);
  }
}
