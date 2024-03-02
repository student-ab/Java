class chaatra {
  int id;
  int roll;

  public chaatra(int i, int r) {
    id = i;
    roll = r;

  }

  public int getid() {
    return id;
  }

  public int getroll() {
    return roll;
  }

  void display() {
    System.out.println(id + "and " + roll);

  }

}

// class borrow extends chaatra {
// public void show() {
// System.out.println("the id" + id);
// }

// public void showname() {
// System.out.println("the id" + name);
// }
// }

public class student {
  public static void main(String[] args) {
    chaatra abhi = new chaatra(12, 3);
    abhi.display();
    // abhi.id = 12;
    // abhi.name = "abhishek nigam";
    // abhi.show();
    // abhi.showname();
  }

}
