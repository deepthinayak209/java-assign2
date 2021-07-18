/*Write a program to calculate the grade of a student. Handle the exceptions in the following cases.  

1. If the USN does not start with 4NM, the then handle invalidUsn exception. 

2. If marks of any one of the subjects is less than zero or greater 100, handle invalidMarks exception. */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class invalidUsn extends Exception
{}
class invalidMarks extends Exception
{}
public class a5
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String rno;
		Integer m1,m2,m3,total;
		try
		{
			System.out.println("Enter the Rollno :");
			rno=sc.nextLine().toUpperCase();
			Pattern pattern = Pattern.compile("4NM");
	    	Matcher matcher = pattern.matcher(rno);
	    	boolean matchFound = matcher.find();
	    	if(!matchFound) 
	      		throw new invalidUsn(); 
	      	else
	      	{
	      		System.out.println("Enter the Marks (3 Subjects):");
	      		m1=sc.nextInt();
	      		m2=sc.nextInt();
	      		m3=sc.nextInt();
	      		if((m1<0 || m1>100) || (m2<0 || m2>100) || (m3<0 || m3>100))
	      			throw new invalidMarks();
	      		else
	      			total = m1 + m2 + m3;	      			
	      		System.out.println("Total : "+total);
	      		System.exit(0);
	      	}
		}
		catch(invalidUsn e)
		{
			System.out.println("Invalid USN!!");
		}
		catch(invalidMarks e)
		{
			System.out.println("Enter a Valid Marks!!");
		}
	}
}

/*

OUTPUT:




F:\mca\2sem\java\assignment2>java a5
Enter the Rollno :
343
Invalid USN!!



F:\mca\2sem\java\assignment2>java a5
Enter the Rollno :
4nm20mc021
Enter the Marks (3 Subjects):
90
65
67
Total : 222

*/

