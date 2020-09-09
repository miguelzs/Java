//********************************************************************
//  NameTag.java       Author: Lewis/Loftus
//
//  Demonstrates the use of command line arguments.
//********************************************************************

public class NameTag
{
   //-----------------------------------------------------------------
   //  Prints a simple name tag using a greeting and a name that is
   //  specified by the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ();
      for (String name : args) {
         System.out.println(name);
      }
      for (int i = 0; i< args.length; i++){
         args[0] = "Something";
         System.out.println(args[i]);
      }

      System.out.println ();
   }
}
