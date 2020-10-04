//********************************************************************
//  Tester.java       Author: Stasko
//
//  Demonstrates the basic structure of a Java application.
//********************************************************************

import java.util.Scanner;

public class WrapperEx {
   public static Integer version;
   //-----------------------------------------------------------------
   //  Prints a text string.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int val;
      String s1, s2;
		
      System.out.println("Enter the string to parse for an int");
		
      Scanner scan = new Scanner(System.in);
      s1 = scan.next();
      //s1 = scan.nextLine();
      val = Integer.parseInt(s1);
      System.out.println ("The value is "+val+" and orig is->"+s1);
		
      s2 = Integer.toBinaryString(val);
      System.out.println("The value in binary is "+s2);
      String b = Character.toString('b');

      int myInt = getVersion();
      // this is the same as below:
      //int myInt = getVersion().intValue();
      testAutoUnboxingNPE(null);
   }
   private static void testAutoUnboxingNPE(Boolean testNPE) {
      // The following 2 lines are what is happening in: if(testNPE){
      // boolean testNPETemp = testNPE.booleanValue();
      // if(testNPETemp){
      if(testNPE){
         System.out.println("I am true");
      } else if(testNPE){ // else if(testNPETemp)
         System.out.println("I am false");
      }
   }
   public static Integer getVersion() {
      return version;
   }
}
