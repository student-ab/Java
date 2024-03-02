
interface sampleinterface {
  void meth1();

  void meth2();
}

interface Childsampleinterface extends sampleinterface {
  void meth3();

  void meth4();

}

class MySampleClass implements Childsampleinterface {
  public void meth1() {
    System.out.println("meth1" + Math.random() * 1000); // add this for creative
  };

  public void meth2() {
    System.out.println("meth2");
  }

  public void meth3() {
    System.out.println("meth3");
  };

  public void meth4() {
    System.out.println("meth4");
  };

}

public class Inheritanceininterface {
  public static void main(String[] args) {
    MySampleClass sc = new MySampleClass();
    sc.meth1();
    sc.meth2();
    sc.meth3();
    sc.meth4();

  }

}
