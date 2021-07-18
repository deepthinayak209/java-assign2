/*Create a program to demonstrate the different situations where finally block can be used. */

import java.util.Scanner;
class a6
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("1st case: No Exception Occured");
    System.out.println("2nd case: Exception Occured & Not handled");
    System.out.println("3rd case: Exception Occured & handled");
    System.out.println("Enter the case :");
    Integer n=sc.nextInt();
    if(n==1)
    {
      try 
      {
        
        int num;
        num = 77 / 11;
        System.out.println("The output is =" + num);
      } 
      finally 
      {
        System.out.println("finally executed");
      }
      System.out.println("End of 1st case");
    }
    else if(n==2)
    {
      try 
      {
        
        int num;
        num = 30 / 0;
        System.out.println("output is =" + num);
      } 
      finally 
      {
        System.out.println("finally executed");
      }
      System.out.println("End of 2nd case");
    }
    else
    {
      try 
      {
        int num;
        num = 30 / 0;
        System.out.println("output is =" + num);
      } 
      catch (ArithmeticException er) 
      {
        System.out.println(er);
      } 
      finally 
      {
        System.out.println("finally executed");
      }
      System.out.println("End of 3rd case");
    }
  }
}


/*
OUTPUT:


F:\mca\2sem\java\assignment2>java a6
1st case: No Exception Occured
2nd case: Exception Occured & Not handled
3rd case: Exception Occured & handled
Enter the case :
1
The output is =7
finally executed
End of 1st case

F:\mca\2sem\java\assignment2>java a6
1st case: No Exception Occured
2nd case: Exception Occured & Not handled
3rd case: Exception Occured & handled
Enter the case :
2
finally executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at a6.main(a6.java:33)

F:\mca\2sem\java\assignment2>java a6
1st case: No Exception Occured
2nd case: Exception Occured & Not handled
3rd case: Exception Occured & handled
Enter the case :
3
java.lang.ArithmeticException: / by zero
finally executed
End of 3rd case


*/