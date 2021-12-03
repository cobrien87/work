import java.util.*;

public class Countdown {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int countdown = input.nextInt();
    while (countdown >0){
      System.out.println("Countdown");
      countdown--;
    }
    System.out.println("Lift off!");
  }
}
