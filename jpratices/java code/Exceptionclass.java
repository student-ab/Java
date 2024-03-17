
import java.util.Scanner;
class myException extends Exception
{
  @Override public String toString ()
  {
	return "i am toString()";
  }
   @Override public String getMessage ()
  {
	return " i am getMessage ";

  }
}

public class Exceptionclass
{
  public static void main (String[]args)
  {
	int a;
	Scanner sc = new Scanner (System.in);
	  a = sc.nextInt ();
	if (a < 9)
	  {
		try
		{
		  throw new myException ();




		}
		catch (Exception e)
		{
		  System.out.println (e.getMessage ());
		};






	  }



  }
}
