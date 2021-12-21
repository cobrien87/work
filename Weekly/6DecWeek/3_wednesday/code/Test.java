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

    int counter = 0;
    int a = 4;
    int b = 5;
    for (int i = 0; i < a; i++){
      for (int j = 0; j < b; j++){
        counter++;
      }
    }
    System.out.print(counter);

  }

  public static String enCoder(String incriptedString){
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    String output = "";
    int  num;
    String character;
    for (int i = 0; i <incriptedString.length();i++ ){
      character = incriptedString.substring(i,i+1);
      num = alpha.indexOf(character);
      output += num;
    }
    return output;
  }


  public static void problemFour(){

  }

  public static void inputPassword(String password, int numGuesses){
    int counter = 0;

    Scanner input = new Scanner(System.in);
    for (int i = 0; i < numGuesses; i++){
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
  inputPassword("Java rulz", 4);
  }
}
