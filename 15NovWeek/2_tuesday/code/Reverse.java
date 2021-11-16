import java.util.*;
public class Reverse{
  public static String reverse(String str){
    // implement reverse method here
    String newString  = "";
    for (int i = 0 ; i<str.length(); i++){
      char character = str.charAt(i);
      newString = character + newString;
    }
    return newString;
  }//end reverse
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sentence to be reversed: ");
    String str = input.nextLine();
    String reverse = reverse(str);
    System.out.println(reverse);
  }//end main
}
