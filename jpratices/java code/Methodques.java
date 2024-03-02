public class Methodques {
  // static void table(int a) {
  // for (int i = 0; i <= 10; i++) {
  // System.out.format("%d X %d = %d\n", a, i, i * a);
  // }

  // }

  // static void pattern(int a) {
  // for (int i = 0; i < a; i++) {
  // for (int j = 0; j < i + 1; j++) {
  // System.out.print("*");

  // }
  // System.out.println();

  // }

  // }

  // static int sumrec(int a) {
  // if (a == 1) {
  // return 1;

  // } else {
  // return a + sumrec(a - 1);
  // }
  // }
  static float convertor(float a) {
    return (a - 32) * 5 / 9;

  }

  public static void main(String[] args) {
    // pattern(4);
    // table(6);
    // int s = sumrec(5);
    // System.out.println(s);

    float s = convertor(100);
    System.out.println(s);

  }

}
