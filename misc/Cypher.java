public class Cypher{

  public static String enCoder(String input, String alpha){
    //Assumes input is a string of  letters
    String output = "";

    for (int i = 0; i <input.length(); i++){
      String character = input.substring(i,i+1);
      int num = alpha.indexOf(character);
      output += num+"-";
    }
    return output;
  }

  public static String deCoder(String input, String alpha){

    String number = "";
    String output = "";
    for (int i = 0; i < input.length(); i++){
      String character = input.substring(i,i+1);
      if (character.equals("-")){
        String new_char = alpha.substring(Integer.valueOf(number), Integer.valueOf(number) + 1);
        output += new_char;
        number = "";
      } else {
        number += character;
      }

    }
    return output;
  }

  public static void main(String[] args){
    String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .?!";
    String code = enCoder("I love Java! Do you?", alpha);
    System.out.println("Encrypted string: " + code);
    code  = deCoder(code, alpha);
    System.out.print("Unencrypted string: " + code);
  }
}
