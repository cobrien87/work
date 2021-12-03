import java.util.*;

public class Countdown {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int countdown = input.nextInt();
    System.out.println("countdown = " + countdown);
    for (int i = 0; i< countdown; i++){
      System.out.println("Countdown");

    }
    System.out.println("Lift off!");
  }
}
