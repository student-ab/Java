class mythread extends Thread
{
  
public mythread (String name)
  {
	
super (name);
  
}
   
public void run ()
  {
	
int i = 34;
	
System.out.println ("thanks you");
	
	  //   while(true){
	  //       System.out.println("my thread");
	  //   }
} 
} 
public class ThreadConstructor 
  { 
public static void main (String[]args) 
{
mythread t1 = new mythread ("abhishek");

mythread t2 = new mythread ("abhishek");

t1.start ();

 
t2.start ();

System.out.println ("the id of thread is " + t1.getId ());

System.out.println ("the id of thread is " + t1.getName ());

 
System.out.println ("the id of thread is " + t2.getId ());

System.out.println ("the id of thread is " + t2.getName ());

 
 
 
 
} 
} 
