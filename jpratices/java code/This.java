class Ekclass {
  int i;

  public Ekclass(int a) {
    this.i = a;
    System.out.println("abhishek function");

  }

  public int geti() {
    return i;

  }
}

class Doclass extends Ekclass {
  Doclass(int c) {
    super(c);
    System.out.println("i am a constructor");
  }

}

public class This {
  public static void main(String[] args) {
    // Ekclass e = new Ekclass(65);
    // System.out.println(e.geti());
    Doclass d = new Doclass(5);
    System.out.println(d.geti());

  }

}
