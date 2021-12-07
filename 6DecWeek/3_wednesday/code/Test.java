import java.util.*;
public class Test{
  public void problemOne(){
    int count = 10;
    for (int i = 1; i<5; i++){
      count = count + count;
    }
    count = count - 5;

    System.out.print("count: " + count);
  }
  public static void problemTwo(){
    int sum = 0;
    while(sum < 100){
      sum += 5;
      System.out.println(sum);
    }
  }

  public static void problemThree(){
    String str = "The lazy dog jumped over the quick brown fox.";

  }

  public static String enCoder(String incriptedString){
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    String output = "";
    int  num;
    String character;
    for (int i = 0; i <incriptedString.length();i++ ){
      character = incriptedString.substring(i,i+1);
      num = alpha.indexOf(character);
      output += num +1;
    }
    return output;
  }


  public static void problemFour(){
    
  }

  public static void inputPassword(String password){
    int counter = 0;

    Scanner input = new Scanner(System.in);
    while (counter < 5){
      System.out.print("Enter your password: ");
      String str = input.nextLine();
      if (str.equals(password)){
        System.out.println("Welcome!");
        return;
      } else{
        System.out.println("Wrong password! Guess again.");
      }
    }
  }
  public static void main(String[] args){
    System.out.print(enCoder("decaf"));
  }
}
