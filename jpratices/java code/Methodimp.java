public class Methodimp {
  static int sum(int... arr) {
    int result = 0;
    for (int a : arr) {
      result += a;

    }
    return result;

  }

  public static void main(String[] args) {
    System.err.println(" the sum is " + sum(2, 4));
    System.err.println(" the sum is " + sum(2, 4, 6));
    System.err.println(" the sum is " + sum(2, 4, 6, 8));
    System.err.println(" the sum is " + sum(2, 4, 6, 8, 10));

  }

}

