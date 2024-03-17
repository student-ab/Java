class Cylinder {
  private int lenght;
  private int wreath;
  private int height;

  public Cylinder(int l, int w, int h) {
    this.lenght = l;
    this.wreath = w;
    this.height = h;

  }

  public int getlenght() { 
    
    return lenght;
  }

  public int getwreath() {
    return wreath;
  }

  public int getheight() {
    return height;
  }

  // public void setradius(int r) {
  // this.radius = r;
  // }

  // public int getheight() {
  // return height;
  // }

  // public void setheight(int h) {
  // this.height = h;
  // }

  public double cuboid() {
    return lenght * wreath * height;
  }
}
// public double volume() {
// return Math.PI * radius * radius * height;
// }
// }

public class Constructorques {
  public static void main(String[] args) {
    Cylinder area = new Cylinder(3, 3, 3);
    // MYcylinder.setheight(22);
    // System.out.println(MYcylinder.getheight());

    // MYcylinder.setradius(32);
    // System.out.println(MYcylinder.getradius());
    // System.out.println(.surfacearea());
    System.out.println(area.cuboid());
    // System.out.println(MYcylinder.volume());
  }

}
