
import java.util.Scanner;

public class Headling
{ 
  public static void main (String[]args)
  {
	System.out.println ("Headling in java");
	int[] marks = new int[3];
	  marks[0] = 7;
	  marks[1] = 46;
	  marks[2] = 8;
	Scanner sc = new Scanner (System.in);
	  System.out.println ("enter the array index");
	int ind = sc.nextInt ();

	  System.out.
	  println ("Enter the number you want to divided the value with");
	int number = sc.nextInt ();
	  try
	{
	  System.out.println (" the value of array index is :" + marks[ind]);
	  System.out.println (" the value of array/number index is :" +
						  marks[ind] / number);
	}
	catch (ArithmeticException e)
	{
	  System.out.println ("(ArithmeticException occured!");
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	  System.out.println ("ArrayIndexOutOfBoundsException occured!");
	}catch (Exception e)
	{
	  System.out.println ("some other exception occured");
	}
  




  }
}
