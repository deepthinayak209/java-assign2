/* Write a program to demonstrate the use of throw keyword in the following cases. 

1. To throw built-in exception 

2. To throw user-defined exception. 
*/

import java.util.Scanner;
class MyException extends Exception{}

public class a3 {
	public static void main(String[] args) 
    {
       a3 p = new a3();
       Scanner sc=new Scanner(System.in);
       System.out.println("1.Built-In 2.User-Defined");
       System.out.println("Enter Choice :");
       Integer n=sc.nextInt();
       Integer tot;
       try
       {
       		if(n==1)
       		 	tot=12/0;
       		else
       		{
       			Integer num=4,den=0;
               if(den==0)
                  throw new MyException();
               else
       			   System.out.println("Result : "+ num/den);        
       		}
       }
       catch(ArithmeticException e)
       {
       		System.out.println(e);
       }   
       catch(MyException e)
       {
            System.out.println("Denominator should be > 0");
       }    
    }
}

// OUTPUT:

// F:\mca\2sem\java\assignment2>java a3
// 1.Built-In 2.User-Defined
// Enter Choice :
// 1
// java.lang.ArithmeticException: / by zero

// F:\mca\2sem\java\assignment2>java a3
// 1.Built-In 2.User-Defined
// Enter Choice :
// 2
// Denominator should be > 0
