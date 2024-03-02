public class Attempts {
  static int mul(int a, int b) {
    int c;
    c = a * a + b * b;
    return c;

  }

  static int mul(int a) {
    int c;
    c = a * a;
    return c;

  }

  static int mul(int a, int b, int d) {
    int c;
    c = a + b + d;
    return c;

  }

  public static void main(String[] args) {
    System.out.println(mul(2, 1));
    System.out.println(mul(2));
    System.out.println(mul(2, 2, 6));

  }

  // public static void main(String[] args) {
  // System.out.println("the area is" + myMethod(2));

  // }

  // static int number(int m) {
  // int z = m * m;
  // return z;

  // }

  // public static void main(String[] args) {
  // int a = 23;
  // int z = number(a);
  // System.out.println(z);

}
