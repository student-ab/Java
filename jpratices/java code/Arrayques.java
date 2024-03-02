public class Arrayques {
  public static void main(String[] args) {
    // float[] marks = { 43.4f, 421.2f, 312.4f, 99.4f, 756.5f };
    // float num = 43.4534f;
    // boolean isInarray = false;
    // for (float element : marks) {
    // if (num == element) {
    // isInarray = true;
    // break;

    // }

    // }
    // if (isInarray) {
    // System.out.println("the value is present ");

    // } else {
    // System.out.println("the value is not present ");

    // }

    // float[] marks = { 43.4f, 421.2f, 312.4f, 99.4f, 756.5f };
    // float sum = 0;

    // for (float element : marks) {
    // sum = sum + element;

    // }
    // System.out.println("the value of average marks is" + sum / marks.length);

    // int[] marks = { 43, 4, 312, 99, 756 };
    // int max = 0;

    // for (int e : marks) {
    // if (e > max) {
    // max = e;

    // }
    // System.out.println("the maximum value is" + max);
    // }

    int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
    for (int i = 0; i < myNumbers.length; ++i) {
      for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }

    int[] marks = { 3, 4, 12, 69, 856 };
    boolean issorted = true;
    for (int i = 0; i < marks.length; i++) {
      if (marks[i] > marks[i + 1]) {
        issorted = false;
        break;

      }

    }
    if (issorted) {
      System.out.println("sorted");

    } else {
      System.out.println("not");
    }

  }

}
