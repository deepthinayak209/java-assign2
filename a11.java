/*  Write a class that implements Runnable interface. 
Print ten greetings of Hello, World! in the format “Fri Jun 11 23:12:12 PST 2021 Hello, World!” with 
a time delay of 1 second between each greeting. 
To display the time, use Date class of java.util package. 
When every thread dies, display the message “Goodbye!!”  */


class threads implements Runnable
{
	int limit;
	threads(int limit)
	{
		this.limit=limit;
	}
	public void run()
	{
		try
		{
			if(limit>=10)
				return;
			java.util.Date date=new java.util.Date();
			System.out.println(date+" Hello, World!");
			Thread.sleep(1000);
			Thread th=new Thread(new threads(limit+1));
			th.start();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Good Bye");
	}
}
public class a11 
{

	public static void main(String[] args) 
	{
		Thread t=new Thread(new threads(0));
		t.start();
	}
}

/*

OUTPUT:

Wed Jul 07 04:42:47 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:48 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:49 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:50 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:51 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:52 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:53 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:54 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:55 UTC 2021 Hello, World!
Good Bye
Wed Jul 07 04:42:57 UTC 2021 Hello, World!

*/