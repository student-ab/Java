class Employess {
  int salary;
  String name;

  public int getsalary() {
    return salary;
  }

  public String getName() {
    return name;

  }

  public void setName(String n) {
    name = n;
  }
}

class cellphone {
  public void ringing() {
    System.out.println("ringing ........");
  }

  public void calling() {
    System.out.println("calling ........");
  }
}

class Square {
  int a, b;

  public int positivwwhole() {
    return a * a + b * b;
  }

  public int negativwwhole() {
    return a * a - b * b;
  }

}

class Tommy {
  public void hit() {
    System.out.println("hittig the enemy");
  }

  public void run() {
    System.out.println("running from the enemy");
  }

  public void fire() {
    System.out.println("firing on the enemy");
  }
}

public class Classques {
  public static void main(String[] args) {
    // Square sc = new Square();
    // sc.a = 5;
    // sc.b = 3;
    // System.out.println(sc.positivwwhole());
    // System.out.println(sc.negativwwhole());

    Tommy player = new Tommy();
    player.hit();
    player.run();
    player.fire();

    /*
     * Employess abhi = new Employess();
     * abhi.setName("abhisheknigam");
     * abhi.salary = 10000;
     * System.out.println(abhi.getsalary());
     * System.out.println(abhi.getName());
     * 
     * cellphone realme = new cellphone();
     * realme.ringing();
     * realme.calling();
     */

  }

}
