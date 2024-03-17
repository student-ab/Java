// import Circle.Cylinder1;

// class Circle {
//   public int radius;

//   Circle(int r) {
//     this.radius = r;
//   }

//   public double area() {
//     System.out.println("the area of circle is:");
//     return Math.PI * this.radius * this.radius;
//   }
// }

class Cylinder1 {
  public int height;
  public int radius;

  Cylinder1(int r, int h) {
    this.radius = r;

    this.height = h;

  }

  public double volume() {
    System.out.println("the volume of cylinder is:");
    return Math.PI * this.radius * this.radius * height;
  }

}

class semi extends Cylinder1 {
  public int lenght;

  semi(int r, int h, int l) {

    super(r, h);
    // this.height = h;
    this.lenght = l;

  }

  public double mul() {
    System.out.println("the volume of cylinder is:");
    return Math.PI * this.radius * this.radius * height * lenght;
  }

  public void show() {
    System.out.println("my self construc:");
    // return Math.PI * this.radius * this.radius * height * lenght;
  }

}

public class Inhertanceques {
  public static void main(String[] args) {

    // problenm 1

    // Circle obj = new Circle(2);
    // System.out.println(obj.area());

    // Cylinder1 obj = new Cylinder1(2, 3);
    // System.out.println(obj.volume());

    semi obj = new semi(2, 3, 2);
    System.out.println(obj.mul());
    System.out.println(obj.volume());
    obj.show();
    
  }

}














class phone
{
  
public void call ()
  {
	
System.out.println ("calling.....");

} 
} 
class smartphone extends phone
{
  
public void music ()
  {
	
System.out.println ("music.....");
  
} 
public void cemera ()
  {
	
System.out.println ("click photo.....");
  
} 
public void internet ()
  {
	
System.out.println ("Browser using.....");

} 
 
} 
public class Inhertanceques 
 

{
  
 
 
public static void main (String[]args) 
 { 
phone p = new phone ();
	
p.music();
	
p.call ();
	
p.cemera ();
	
p.internet ();
	
smartphone s = new smartphone ();
	
s.music ();
	
s.call ();
	
s.cemera ();
	
s.internet ();

 
 
 
 
 
 
} 
 
} 

