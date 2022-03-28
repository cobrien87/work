import java.util.*;

public class MyProgram
{
    public static void main(String[] args)
    {

        ArrayList<String>  roster = new ArrayList<String>();
        roster.add("Saad");
        roster.add("Yosuf");
        roster.add("Sam");
        roster.add("Rafiki");
        roster.add("Luis");
        roster.add("Maddox");
    display(roster);
    alphabetizer(roster);
    display(roster);

  }//end main

    public static void display(ArrayList<String> arr){
      String str = "[ ";
      for (String item: arr){
        str+= item +" ";
      }
      str += "]";
      System.out.println(str);

    }//end display

    public static void alphabetizer(ArrayList<String> arr){
      //TODO
      ;
    }
}
