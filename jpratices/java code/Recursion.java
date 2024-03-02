public class Recursion {
  static int factorial(int a) {
    if (a == 0 || a == 1) {
      return 1;

    } else {
      return a * factorial(a - 1);

      // int product = 1 ;
      // for (int i = 0; i <= a; i++) {
      // product *= i;

      // }
      // return product;

    }

  }

  public static void main(String[] args) {
    int x = 3;
    System.out.println("the value of factorial is :"
        + factorial(x));

  }

}
