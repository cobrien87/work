import java.util.*;
public class InsertionSort{

  public static void main(String[] args){
    // REPLACE WITH COMMENT
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(-3);
    arr.add(7);
    arr.add(38);
    arr.add(-10);
    arr.add(18);
    arr.add(8);
    displayArrList(arr);
    insertionSort(arr);
    displayArrList(arr);
  }
  public static void displayArrList(ArrayList<Integer> arr){
    // REPLACE WITH COMMENT
    String str = "[ ";
    for (int item: arr){
      str+= item +" ";
    }
    str += "]";
    System.out.println(str);
 }
  public static void insertionSort(ArrayList<Integer> arr){
    // REPLACE WITH COMMENT
    int toAdd;
    for (int current = 1; current < arr.size(); current++){
      //REPLACE WITH COMMENT
      toAdd = arr.get(current);
      arr.remove(current);
      arr = moveTo(current,toAdd, arr);

      displayArrList(arr);
    }
  }//end insertionSort
  public static ArrayList<Integer> moveTo(int last, int toAdd, ArrayList<Integer> arr){
    // REPLACE WITH COMMENT
    for (int index = 0; index < last -1 ; index++){
      if (toAdd > arr.get(index)){
        arr.add(index, toAdd);
        return arr;
      }

    }
    arr.add(last, toAdd);
    return arr;
  }//end moveTo
}// end insertionSort
