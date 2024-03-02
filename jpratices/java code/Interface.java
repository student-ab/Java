
interface Bicycle {
  void applyBrake(int decrement);

  void speedup(int increment);
}

interface HornBicyle {
  void blowhorn();

  void bloghornmhn();
}

class avoncycle implements Bicycle, HornBicyle { // not a inhertance and apply multiple interface(method group of
                                                 // method)
  // void blowhorn() {
  // System.out.println(" blow the horn now !!!!");
  // }

  public void applyBrake(int decrement) {

    System.out.println("apply break");
  }

  public void speedup(int incrementcrement) {
    System.out.println("speed up");
  }

  // another interface include

  public void blowhorn() {
    System.out.println("kabhi kushi kabhi gam");
  }

  public void bloghornmhn() {
    System.out.println("kabhi gam");
  }
}

public class Interface {
  public static void main(String[] args) {
    avoncycle cycleabhi = new avoncycle();
    cycleabhi.applyBrake(2);
    cycleabhi.blowhorn();
    cycleabhi.bloghornmhn();

  }

}
