public class Finallyblock
{
    

  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	try
	{
	    int a = 6;
	    int b = 0;
	  int c = a/b;
	    System.out.println (c); 
	} catch (Exception e)
	{
	  System.out.println (e);
	}
	finally{
	    System.out.println ("Always execute");
	    
	}
  }
}
