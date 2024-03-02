public class Methodoverload {
  // static void change(int a ){
  // a = 96; //method can't change value of variable;
  // }

  // static void change2(int[] arr) {
  // arr[0] = 96; // method can change value of array;
  // }

  // static void joke() {
  // System.out.println("i am so rich");
  // }

  // method overloading
  static void greet() {
    System.out.println("good morning bro");
  }

  static void greet(int a) {
    System.out.println("good morning bro " + a + "times");
  }

  static void greet(int a, int b) {
    System.out.println("good morning bro " + a + "times");
    System.out.println("good morning bro " + b + "times");
  }

  public static void main(String[] args) {
    // joke();
    // int [] marks = {23, 12 ,65, 45, 32};
    // int x = 91;
    // change(x);

    // int[] marks = { 23, 12, 65, 45, 32 };

    // change2(marks);
    // System.out.println("the change value is " + marks[0]);

    // method overloading

    greet();
    greet(100);
    greet(100, 200);

  }

}
