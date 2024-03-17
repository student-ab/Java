
class thread1 implements Runnable
{
  public void run ()
  {
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
	System.out.println ("thread1 of class thread1");
  }
}

class thread2 implements Runnable
{
  public void run ()
  {
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");
	System.out.println ("thread2 of class thread2");

  }
}
public class Runablethread
{
  public static void main (String[]args)
  {
	System.out.println ("runable thread");
	thread1 buttel1 = new thread1 ();
	Thread gun1 = new Thread (buttel1);
	thread2 buttel2 = new thread2 ();
	Thread gun2 = new Thread (buttel2);
	  gun2.start ();
	  gun1.start ();




  }
}
