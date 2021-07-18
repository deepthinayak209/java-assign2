/*Write a JAVA program to implement a Queue using user defined Exception Handling(also make use of
 throw, throws.).*/


import java.io.*;
import java.util.*;
class a8
{
	public static void main(String args[])throws Exception
	{
		try
		{
		Scanner in=new Scanner(System.in);
		int size,item;
		System.out.println("Queue operation");
		System.out.println("Enter the size of the queue");
		size=in.nextInt();
		Queueimp q=new Queueimp(size);
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			int op=in.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("Enter integer number:");
					item=in.nextInt();
					q.insert(item);
					break;
				case 2:
					q.dele();
					break;
				case 3:
					q.disp();
					System.out.println("");
					break;
				case 4:
					return;
				default:
					System.out.println("Invalid  option");
					break;
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Queueimp
{
	private int size;
	private int front=0;
	private int rear=-1;
	private int[] arrq;
	Queueimp(int size)
	{
		this.size=size;
		arrq=new int[size];		
	}
	public void insert(int item) throws Exception,QueueErr
	{
		try
		{
			if(rear==size-1)
			{
				throw new QueueErr("Queue Overflow");
			}
			else
			{
				rear++;
				arrq[rear]=item;	
				System.out.println("Item inserted successfully");
			}
		}
		catch(QueueErr e)
		{
			e.printStackTrace();
		}
	}
	public void dele() throws Exception,QueueErr
	{
		int item;
		try
		{
			if(rear<front)
			{
				throw new QueueErr("Queue Underflow");
			}
			else
			{
				item=arrq[front];
				front++;	
				System.out.println("Dleted Item is"+item);
			}
		}
		catch(QueueErr e)
		{
			e.printStackTrace();
		}
	}
	public void disp() throws Exception,QueueErr
	{
		int item;
		try
		{
			if(rear<front)
			{
				throw new QueueErr("Queue Underflow");
			}
			else
			{
				System.out.println("Items are");
				for(int i=rear;i>=front;i--)
				{
					System.out.print(arrq[i]);
					System.out.print("  ");
				}
			}
		}
		catch(QueueErr e)
		{
			e.printStackTrace();
		}
	}	
}
class QueueErr extends Exception
{
	QueueErr(String msg)
	{
		super(msg);
	}
} 


/*
OUTPUT:

F:\mca\2sem\java\assignment2>java a8
Queue operation
Enter the size of the queue
3
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
1
Enter integer number:
111
Item inserted successfully
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
1
Enter integer number:
222
Item inserted successfully
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
1
Enter integer number:
333
Item inserted successfully
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
1
Enter integer number:
444
QueueErr: Queue Overflow
        at Queueimp.insert(a8.java:69)
        at a8.main(a8.java:29)
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
3
Items are
333  222  111
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
2
Dleted Item is111
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
2
Dleted Item is222
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
2
Dleted Item is333
Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
3
QueueErr: Queue Underflow
        at Queueimp.disp(a8.java:111)
        at a8.main(a8.java:35)

Menu
1.Insert
2.Delete
3.Display
4.Exit
Enter your choice:
4

*/
