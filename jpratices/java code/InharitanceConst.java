import java.util.function.Supplier;

class Base1 {
  public Base1() {
    System.out.println("base class constructor");
  }

  public Base1(int x) { // method overloading
    System.out.println("base2 overloded class constructor" + x);
  }
}

class drived1 extends Base1 {

  public drived1() {
    // super();
    System.out.println("drived class constructor");
  }

  public drived1(int x, int y) { // method overloading
    super(x);
    System.out.println("drived class constructor y is " + y);
  }

  public void chap() {
    System.out.println("this is second constructor");
  }

  public void chapnext() {
    System.out.println("this is another  second constructor of drived1");
  }
}

class Childdrived extends drived1 {

  public Childdrived() {

    System.out.println("drived class constructor");
  }

  public Childdrived(int x, int y, int z) {
    super(x, y);

    System.out.println("drived class constructor z is " + z);
  }
}

public class InharitanceConst {
  public static void main(String[] args) {
    // Base1 b = new Base1();

    // drived1 d = new drived1();
    Childdrived child = new Childdrived(12, 13, 14);
    child.chap();
    child.chapnext();

  }

}
