class Know {
  private int id;
  private String name;

  // method overloading

  // public Myemployees(String myname, int myid) {
  // id = myid;
  // name = myname;
  // }

  public Know(int a, String n) {
    this.id = a;
    this.name = n;
  }
  

  public String getname() {
    return name;
  }

  // public void setname(String n) {
  // this.name = n;
  // }

  public int getid() {
    return id;
  }

  // public void setid(int i) {
  // this.id = i;
  // }

}

public class Constructor {
  public static void main(String[] args) {
    // // Myemployees abhi = new Myemployees("abhishek nigam", 4);
    // Know abhi = new Know(2, "abhishek");
    // System.out.println(abhi.getid());
    // System.out.println(abhi.getname());

  }

}
