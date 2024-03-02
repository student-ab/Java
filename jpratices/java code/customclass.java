
class worker {
  int id;
  String name;
  int salary;

  public void detail() {
    System.out.println("my id is " + id);
    System.out.println("my name is " + name);
  }

  public int getsalary() {
    return salary;
  }

  public void done(int a) {
    System.out.println("all work done" + a);
  }

}

public class customclass {
  public static void main(String[] args) {
    System.out.println("this is fitst class");

    worker abhishek = new worker();
    abhishek.id = 12;
    abhishek.name = "abhishek nigam";
    abhishek.salary = 10000;
    // abhishek.done(4);
    abhishek.detail();
    int salaryabhi = abhishek.getsalary();
    System.out.println(salaryabhi);
    // abhishek.done();

    // employess aman = new employess();
    // aman.id = 13;
    // aman.name = "aman nigam";
    // aman.salary = 10000;
    // aman.detail();
    // int salaryaman = aman.getsalary();
    // System.out.println(salaryaman);

  }

}
