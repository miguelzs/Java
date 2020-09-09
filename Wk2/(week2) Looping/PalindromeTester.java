//********************************************************************
//  PalindromeTester.java       Author: Lewis/Loftus
//
//  Demonstrates the use of nested while loops.
//  Examples: anna, 61516, noon, radar, abba, abcba
//********************************************************************

import java.util.Scanner;

public class PalindromeTester {
    //-----------------------------------------------------------------
    //  Tests strings to see if they are palindromes.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        String str, another = "y";
        int leftIndex, rightIndex;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) { // allows y or Y
            System.out.println("Enter a potential palindrome:");
            // get the next line
            str = scan.nextLine();
            // convert to all lower case
            str = str.toLowerCase();

            leftIndex = 0;
            rightIndex = str.length() - 1;

            while (str.charAt(leftIndex) == str.charAt(rightIndex)
                    && leftIndex < rightIndex) {
                leftIndex++;
                rightIndex--;
            }

            System.out.println();

            if (leftIndex < rightIndex) {
                System.out.println("That string is NOT a palindrome.");
            } else {
                System.out.println("That string IS a palindrome.");
            }

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }
}
