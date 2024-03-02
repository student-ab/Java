
class worker {
  int id;
  String name;
  int salary;

  public void detail() {
    System.out.println("my id is " + id);
    System.out.println("my name is " + name);
  }

  public void done() {
    System.out.println("my id is done ");
    // System.out.println("my name is " + name);
  }

  public int getsalary() {
    return salary;
  }

}

public class All {
  public static void main(String[] args) {
    System.out.println("this is fitst class");

    worker abhishek = new worker();
    abhishek.id = 12;
    abhishek.name = "abhishek nigam";
    abhishek.salary = 10000;
    abhishek.detail();
    abhishek.done();
    int salaryabhi = abhishek.getsalary();
    System.out.println(salaryabhi);

    // employess aman = new employess();
    // aman.id = 13;
    // aman.name = "aman nigam";
    // aman.salary = 10000;
    // aman.detail();
    // int salaryaman = aman.getsalary();
    // System.out.println(salaryaman);

  }

}
