class phone {
  public void showtime() {
    System.out.println("time is 8 am");
  }

  public void on() {
    System.out.println("truning on phone");
  }
}

class smartphone extends phone {
  public void music() {
    System.out.println("playing music"); // predefine funcation can not work
  }

  public void on() {
    System.out.println("truning on smart phone");// overwrite funcation can work
  }

}

public class DynamicMehtod {
  public static void main(String[] args) {

    phone obj = new smartphone();
    // obj.music();
    obj.on();
    obj.showtime();

  }

}
