import java.util.*;
public class Sort{

  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(-3);
    arr.add(7);
    arr.add(38);
    arr.add(-10);
    arr.add(18);
    displayArrList(arr);
    //System.out.println("MinIndex is " + findMinIndex(0, arr));
    selectionSort(arr);
  //  displayArrList(arr);
  }// end main
  public static void displayArrList(ArrayList<Integer> arr){
    String str = "[ ";
    for (int item: arr){
      str+= item +" ";
    }
    str += "]";
    System.out.println(str);

  }//end displayArrList
  public static int findMinIndex(int start, ArrayList<Integer> arr){
    int minIndex = start;
    for (int index = start + 1; index < arr.size(); index++){
      if (arr.get(index) < arr.get(minIndex)){
        minIndex = index;
      }
    }
    return minIndex;
  }//end findMinIndex

  public static void swapIJ(int i, int j, ArrayList<Integer> arr){
    int temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);
  }// end swapIJ
  public static void selectionSort(ArrayList<Integer> arr){
    int nextMindex;
    for (int index = 0; index < arr.size() - 1; index++){
      nextMindex = findMinIndex(index+1, arr);
      swapIJ(index, nextMindex, arr);
      displayArrList(arr);
    }
  }
}
