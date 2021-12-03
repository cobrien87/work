import java.util.*;
public class Reverse{
  public static String reverse(String str){
    // implement reverse method here
    String newString  = "";
    for (int i = str.length() -1 ; i>=0; i--){
      char character = str.charAt(i);
      newString += character;
    }
    return newString;
  }//end reverse
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a sentence to be reversed: ");
    String str = input.nextLine();
    String reverse = reverse(str);
    System.out.println(reverse);
  }//end main
}
