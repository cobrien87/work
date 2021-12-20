import java.util.*;

public class AlphabetizerFinal{
  /**
  * Takes in a string and an alphabetized array, adds the string in the correct location
  * so as to preserve the ordering.
  * Precondition: new_item is a string, list_ordered is an alphabetized array or strings.
  * Postcondition: list_ordered now includes new_item, remains alphabetized
  */
  public static void add_ordered(String new_item, String[] list_ordered){
    String[] new_array = new String[list_ordered.length + 1];
    for (int i = 0; i < list_ordered.length; i++){
      if (new_item.compareTo(list_ordered[i]) <= 0){
        list_ordered[i] = new_item;
        break;
      }
    }
  }


  public static void main(String[] args){
    String[] roster_ordered = {"Luis", "Maddox", "Rafiki", "Saad", "Sam", "Yosuf"};
    System.out.println("Roster before adding new name: " + Arrays.toString(roster_ordered));
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a new name to add: ");
    String new_name = input.nextLine();
    add_ordered(new_name, roster_ordered);
    System.out.println("Roster after adding new name: " + Arrays.toString(roster_ordered));


  }
}
