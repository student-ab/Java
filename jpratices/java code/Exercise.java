import java.util.Random;
import java.util.Scanner;

class Game {
  public int number;
  public int inputnumber;
  public int noofGuesses = 0;

  public int getnoofGuesses() {
    return noofGuesses;
  }

  public void setGuesses(int noofGuesses) {
    this.noofGuesses = noofGuesses;
  }

  public Game() {
    Random rand = new Random();

    this.number = rand.nextInt(100);
  }

  public void takeuserinput() {
    System.out.println("guees the number");
    Scanner sc = new Scanner(System.in);
    inputnumber = sc.nextInt();

  }

  boolean iscorrectnumber() {
    noofGuesses++;

    if (inputnumber == number) {
      System.out.format("yes you quesesit right, it was %d\n you guessed it in %d\n attempts", number, noofGuesses);
      return true;

    } else if (inputnumber < number) {
      System.out.println("too low ...");

    } else if (inputnumber > number) {
      System.out.println("too high ...");

    }

    return false;

  }

}

public class Exercise {
  public static void main(String[] args) {
    Game g = new Game();
    boolean b = false;
    while (!b) {
      g.takeuserinput();
      b = g.iscorrectnumber();
      System.out.println(b);

    }

  }

}
