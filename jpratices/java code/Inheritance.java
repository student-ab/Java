class base {
  int x;

  public int getx() {
    return x;
  }

  public void setx(int i) {
    this.x = i;
  }

  public void printme(int a) {
    System.out.println("i print something" + a);
  }
}

class drived extends base {
  int y;

  public int gety() {
    return y;
  }

  public void sety(int j) {
    this.y = j;
  }

}

public class Inheritance {
  public static void main(String[] args) {

    // object of base class

    // base b = new base();
    // b.setx(5);
    // System.out.println(b.getx());
    // b.printme(12);

    // // object of drived class

    drived d = new drived();
    // d.setx(55);
    // System.out.println(d.getx());

    // drived d = new drived();
    d.sety(55);
    System.out.println(d.gety());
    d.setx(85);
    System.out.println(d.getx());
    d.printme(12);

  }

}
