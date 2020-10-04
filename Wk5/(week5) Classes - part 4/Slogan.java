//********************************************************************
//  Slogan.java       Author: Lewis/Loftus
//
//  Represents a single slogan string.
//********************************************************************

public class Slogan
{
   private String phrase;
   static int count = 0;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the slogan and counts the number of
   //  instances created.
   //-----------------------------------------------------------------
   public Slogan (String str)
   {
      phrase = str;
      count++;
   }

   //-----------------------------------------------------------------
   //  Returns this slogan as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return phrase + Slogan.count;
   }

   //-----------------------------------------------------------------
   //  Returns the number of instances of this class that have been
   //  created.
   //-----------------------------------------------------------------
   public int getCount ()
   {
      System.out.println(phrase);
      return count;
   }

   public static void main(String args[]) {
      Slogan s1 = new Slogan("face your fears!");
      System.out.println(Slogan.count);
      Slogan s2 = new Slogan("face your fears... even more!");
      System.out.println(Slogan.count);

   }
}
