class mythr1 extends Thread
{
  public mythr1 (String name)
  {
	super (name);
  }
  public void run ()
  {
	int i = 34;
	while(true){
	    System.out.println ("thanks you" + this.getName ());
	    
	}
	
  }


}

class ThreadProrites
{

  public static void main (String[]args)
  {
	mythr1 t1 = new mythr1 ("harry1");
	mythr1 t2 = new mythr1 ("harry2");
	mythr1 t3 = new mythr1 ("harry3");
	mythr1 t4 = new mythr1 ("harry4");
	mythr1 t5 = new mythr1 ("harry5 (MOST IMPORTANTS ");
	  t5.setPriority (Thread.MAX_PRIORITY);
	  t1.setPriority (Thread.MIN_PRIORITY);
	  t2.setPriority (Thread.MIN_PRIORITY);
	  t3.setPriority (Thread.MIN_PRIORITY);
	  t4.setPriority (Thread.MIN_PRIORITY);
	  t1.start ();
	  t2.start ();
	  t3.start ();
	  t4.start ();
	  t5.start ();

//       ready queue : 
// java.lang.Thread.MIN_PRIORITY  = 1
// java.lang.Thread.NORM_PRIORITY = 5
// java.lang.Thread.MAX_PRIORITY  = 10
  }
}
