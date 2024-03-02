public class Methods {
  static int logic(int x, int y) {

    int z;
    if (x > y) {
      z = x * y;

    } else {
      z = (x * y) * 3;
    }
    return z;

  }

  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 1;
    int c = logic(a, b);
    System.out.println("the output is :" + c);

    int a1 = 3;
    int b1 = 5;
    int c1 = logic(a1, b1);
    System.out.println("the output is :" + c1);

    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");

  }

}
