

public class Throws
{
  static int divided (int a, int b) throws ArithmeticException
  {
	int result = a / b;
	  return result;
  }
  public static void main (String[]args)
  {
	System.out.println ("Hello World");
	try
	{
	  int c = divided (6, 0);
	    System.out.println (c); // if problem not execute that code
	} catch (Exception e)
	{
	  System.out.println ("Exception");
	}
  }
}
