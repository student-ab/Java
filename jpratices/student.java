class chaatra {
  int id;
  String name;
}

class borrow extends chaatra {
  public void show() {
    System.out.println("the id" + id);
  }

  public void showname() {
    System.out.println("the id" + name);
  }
}

public class student {
  public static void main(String[] args) {
    chaatra abhi = new chaatra();
    abhi.id = 12;
    abhi.name = "abhishek nigam";
    abhi.show();
    abhi.showname()
  }

}
