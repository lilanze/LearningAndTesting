package lanze.learningandtesting.MultiThreadTesting;

/**
 * MultiThreadTest!
 *
 */
class MyThreadTest implements Runnable{
    private int ticket = 5;
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);		//ticket 共享资源，应该加锁的
            }
        }
    }
}



public class main 
{
    public static void main( String[] args )
    {
    	MyThreadTest myth = new MyThreadTest();
        new Thread(myth).start();
        new Thread(myth).start();
        new Thread(myth).start();
    }
}

