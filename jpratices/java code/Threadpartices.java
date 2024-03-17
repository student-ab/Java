class thread1 extends Thread
{
  public void run ()
  {

	while (true)

	  {
		try
		{
		  Thread.sleep (500);
		}
		catch (Exception e)
		{
		  System.out.println (e);
		}
			System.out.println ("good morning");



	  }

  }
}

class thread2 extends Thread
{
  public void run ()
  {

	while (true)
	  {
		try
		{
		  Thread.sleep (500); // are use to delay the execution of program
		}
		catch (Exception e)
		{
		  System.out.println (e);
		}
	
		System.out.println ("night good");


	  }

  }
}

public class Threadpartices
{
  public static void main (String[]args)
  {
	System.out.println ("printing thread");
	thread1 t1 = new thread1 ();
	thread2 t2 = new thread2 ();
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	  t1.start ();
	  t2.start ();
  }
}
