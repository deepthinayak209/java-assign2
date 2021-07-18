/*Write a program to perform banking operations using threads. */

public class a14
{  
    int amount=10000;  
    synchronized void withdraw(int amount)
    {  
        System.out.println("Going to withdraw...");  
        if(this.amount<amount)
        {  
            System.out.println("Less balance; Waiting for deposit...");  
            try
            {
                wait();
            }catch(Exception e)
            {
                
            }
            
        }  
        this.amount-=amount;  
        System.out.println("Withdraw completed...");  
        
    }  
    synchronized void deposit(int amount)
    {  
        System.out.println("Going to deposit...");  
        this.amount+=amount;  
        System.out.println("Deposit completed... ");  
        notify();  
        
    }  
    public static void main(String args[])
    {  
        final a14 c=new a14();  
        new Thread()
        {  
            public void run()
            {
                c.withdraw(15000);
                
            } 
        }.start();  
        new Thread()
        {  
            public void run()
            {
                c.deposit(10000);
                
            }  
        }.start();  
    }
}

/*
OUTPUT:

Going to withdraw...
Less balance; Waiting for deposit...
Going to deposit...
Deposit completed... 
Withdraw completed...

*/