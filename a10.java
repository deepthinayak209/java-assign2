/*Write a program called GreetReverse.java that creates a thread (let's call it Thread 1). 
Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. 
Each thread should print "Hello from Thread <num>!", but you should structure your program such 
that the threads print their greetings in reverse order. */

public class a10 {
  public static void main(String[] args) 
  {
      Thread thread = new Thread(new child(1, 50));
      thread.start();        
  }
}
class child extends Thread 
{
    Integer myID,limit; 
    public child(int myID, int limit) 
    {
        this.myID = myID;
        this.limit = limit;
    }
    public void run() 
    {
        if (myID > limit) 
              return;
        else 
        {
              Thread thread = new Thread(new child((myID+1), limit));
              thread.start();
              try 
              {
                  thread.join();
              } 
              catch (InterruptedException e) 
              {
                System.out.println(e);
              }
              System.out.println("Hello from Thread :" + myID);
        }
    }

}


// OUTPUT:

// Hello from Thread :50
// Hello from Thread :49
// Hello from Thread :48
// Hello from Thread :47
// Hello from Thread :46
// Hello from Thread :45
// Hello from Thread :44
// Hello from Thread :43
// Hello from Thread :42
// Hello from Thread :41
// Hello from Thread :40
// Hello from Thread :39
// Hello from Thread :38
// Hello from Thread :37
// Hello from Thread :36
// Hello from Thread :35
// Hello from Thread :34
// Hello from Thread :33
// Hello from Thread :32
// Hello from Thread :31
// Hello from Thread :30
// Hello from Thread :29
// Hello from Thread :28
// Hello from Thread :27
// Hello from Thread :26
// Hello from Thread :25
// Hello from Thread :24
// Hello from Thread :23
// Hello from Thread :22
// Hello from Thread :21
// Hello from Thread :20
// Hello from Thread :19
// Hello from Thread :18
// Hello from Thread :17
// Hello from Thread :16
// Hello from Thread :15
// Hello from Thread :14
// Hello from Thread :13
// Hello from Thread :12
// Hello from Thread :11
// Hello from Thread :10
// Hello from Thread :9
// Hello from Thread :8
// Hello from Thread :7
// Hello from Thread :6
// Hello from Thread :5
// Hello from Thread :4
// Hello from Thread :3
// Hello from Thread :2
// Hello from Thread :1

