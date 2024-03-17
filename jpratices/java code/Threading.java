
class mythread extends Thread
{
  public void run ()
  {
	int i = 0;
	while (i < 4322)
	  {
		System.out.println ("thread1 is ok");
		System.out.println ("i am happy");

	  }
	i++;
  }
}

class mythread2 extends Thread
{
  public void run ()
  {
	int i = 0;
	while (i < 4322)
	  {
		System.out.println ("thread2 is ok");
		System.out.println ("i am sad");

	  }
	i++;
  }
}

public class Threading
{
  public static void main (String[]args)
  {

	mythread t1 = new mythread ();
	mythread2 t2 = new mythread2 ();
	  t1.start ();
	  t2.start ();



  }
}

 
 