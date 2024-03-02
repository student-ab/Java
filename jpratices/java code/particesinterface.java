abstract class pen {
  abstract void write();

  abstract void refill();
}

class fountain extends pen {
  void write() {
    System.out.println("write something");
  }

  void refill() {
    System.out.println("refill something");
  }

  void changenib() {
    System.out.println("change the nib");
  }
}

class monkey {
  void jump() {
    System.out.println("jumping");
  }

  void bit() {
    System.out.println("biting");
  }
}

interface basicanimal {
  void eat();

  void sleep();

}

class human extends monkey implements basicanimal {
  public void eat() {
    System.out.println("eating");

  }

  public void sleep() {
    System.out.println("sleeping");

  }

  void speak() {
    System.out.println("hello sir");
  }
}

public class particesinterface {
  public static void main(String[] args) {
    // ques 1 and 2
    fountain p = new fountain();
    p.write();
    // p.changenib();

    // ques 3 answer
    human abhi = new human();
    abhi.sleep();

    // ques 5
    monkey m = new human();
    // m.speak() not allowed
    m.bit();
    m.jump();

    basicanimal aman = new human();
    aman.eat();
    aman.sleep();
    // aman.speak() not allowed because monkey does not have speak method
    

  }

}
