class A {
  int a;

  public A(int b) {
    this.a = b;
  }

  public int meth1() {
    return 1;
  }

  public void meth2() {
    System.out.println("i am method of class A");

  }

  public int show() {
    return a;
  }
}

// class d extends A {

// // public void meth2() {
// // System.out.println("i am method of class b ");

// // }

// public void meth3() {
// System.out.println("i am method 3 of class B");

// }
// }

public class Methodoverloading {
  public static void main(String[] args) {
    A a = new A(4);
    System.out.println(a.show());
    // a.meth1();
    // a.meth2();

    // B b = new B();
    // b.meth1();
    // b.meth2();
    // b.meth3();
  }

}
