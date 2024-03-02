public class Array {
  public static void main(String[] args) {
    int sum = 0;

    int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        sum = sum + a[i][j];

      }

    }
    System.out.println(sum);

    // int a[] = { 1, 4, 3, 2 };
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] > a[i++]) {
    // a[i] = a[i++];

    // }
    // System.out.println(a[i]);

    // }

    // int a[] = { 1, 2, 3, 4, 5 };
    // int min = a[0];
    // for (int i = 1; i < 5; i++) {
    // if (min > a[i]) {
    // min = a[i];

    // }

    // }
    // System.out.println(min);

    // int a[] = { 1, 2, 3, 4, 5 };
    // int max = 0;
    // for (int i = 1; i <= 5; i++) {
    // if (a[i] < max) {
    // max = a[i];

    // }

    // }
    // System.out.println(max);

    // int a[] = { 1, 2, 3, 4, 5 };
    // int max = 0;
    // for (int i = 0; i < 5; i++) {
    // if (a[i] > max) {
    // max = a[i];

    // }

    // }
    // System.out.println(max);

    // int a[] = { 12, 12, 12 };
    // int sum = 0;
    // int avg;
    // for (int i = 0; i < a.length; i++) {
    // sum = sum + a[i];

    // }
    // avg = (sum) / a.length;
    // System.out.println(avg);

    // int a[] = { 12, 21, 12 };
    // int sum = 0;
    // for (int i = 0; i < a.length; i++) {
    // sum = sum + a[i];

    // }
    // System.out.println(sum);
  }

}
