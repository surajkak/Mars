package Alpha.GitDemo;

import java.util.Scanner;

class Substration
{
   private static Scanner in;

public static void main(String args[])
   {
      int x, y, z;
 
      System.out.println("Enter two integers to calculate their sub");
      in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
     
      System.out.println("sub of the integers = " + z);
   }
}