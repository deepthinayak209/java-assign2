// Write a java program to generate and handle NumberFormat Exception. 



import java.util.Scanner;

public class a1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Integer :");
			Integer n=Integer.parseInt(sc.next());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Format Not Matching..!"+e);
		}
	}

}

// OUTPUT:

// F:\mca\2sem\java\assignment2>java a1
// Enter the Integer :
// 345

// F:\mca\2sem\java\assignment2>java a1
// Enter the Integer :
// fghjk
// Format Not Matching..!java.lang.NumberFormatException: For input string: "fghjk"