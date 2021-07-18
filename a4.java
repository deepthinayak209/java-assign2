/*Create a user defined class with a method splitString() which splits the string passed 
in as a parameter when ‘/’ is found. If ‘/’ is not found in the string, generate and handle exception.
 If ‘/’ is found or not, display the index of every word in the string at the end.  */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class a4 {
	void splitString(String str)
	{
		try
		{
			Pattern pattern = Pattern.compile("/");
	    	Matcher matcher = pattern.matcher(str);
	    	boolean matchFound = matcher.find();
	    	if(!matchFound) 
	      		throw new MyException(); 
	      	else
	      	{
	      		String str1[]=str.split("/");
	      		for(String a:str1)
	      			System.out.println(a +" Index :"+str.indexOf(a));
	      	}
     	}
     	catch(MyException e)
     	{
     		System.out.println("/ Not Found");
     	}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//String str="hello/how/are/you";
		String str="HELLOHOEAREYOU";
		a4 p=new a4();
		p.splitString(str);
	}

}


/*

OUTPUT:

F:\mca\2sem\java\assignment2>java a4
hello Index :0
how Index :6
are Index :10
you Index :14

F:\mca\2sem\java\assignment2>javac a4.java

F:\mca\2sem\java\assignment2>java a4
/ Not Found


*/



