interface myCamera {
  void takesnap();

  void recordvideo();

  private void greet() {
    System.out.println("your self is good");
  }

  default void record4kvideo() { // can be override in class & use as object
    greet();

    System.out.println("Recording in 4k");
  }
}

interface mywifi {
  String[] getnetworks();

  void Connectnetwork(String network);
}

class Mycellphone {
  void callnumber(int phonenumber) {
    System.out.println("calling" + phonenumber);
  }

  void pickcall() {
    System.out.println("connecting......");
  }
}

class Mysmartphone extends Mycellphone implements mywifi, myCamera {
  public void takesnap() {
    System.out.println("take snap");
  }

  public void recordvideo() {
    System.out.println("video are on record");
  }
  // public void record4kvideo() { // can be override in class & use as object
  // System.out.println("Recording in 4k");
  // }

  public String[] getnetworks() {
    System.out.println("getting list of network");
    String[] networklist = { "harry", "prasthan", "abhishek" };
    return networklist;
  };

  public void Connectnetwork(String network) {
    System.out.println("connecting to " + network);
  }

}

public class polymorphism {
  public static void main(String[] args) {
    myCamera cam1 = new Mysmartphone(); // this is smartphone and use as the camera use camera funcation
    cam1.takesnap();

    cam1.record4kvideo();
    // cam1.getnetworks(); not allowed

    Mysmartphone s = new Mysmartphone();
    s.getnetworks();
    s.record4kvideo();
    s.takesnap();

    // cam1.getnetworks(); not allowed

    // Mysmartphone moto = new Mysmartphone();
    // moto.record4kvideo(); // default method
    // moto.takesnap(); // implement method
    // String[] arr = moto.getnetworks();
    // for (String item : arr) {
    // System.out.println(item);

    // }
  }

}
