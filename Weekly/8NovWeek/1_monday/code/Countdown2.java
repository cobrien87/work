import java.util.*;
public class Countdown{

  public static void countdown(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int countdown = input.nextInt();
    while (countdown >0){
      System.out.println(countdown + "...");
      countdown--;
    }
    System.out.println("Lift off!");
  }
  public static void countdown2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int countdown = input.nextInt();
  }
  public static void countdown3(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int countdown = input.nextInt();
  }


  public static void main(String[] args){
    countdown();
  }
}
