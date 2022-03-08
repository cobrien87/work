import java.util.*;
public class ArrayLists{
  public static void main(String[] args){
  // input scores = {23,46,89,123}; as an ArrayList
   ArrayList<Integer> scores = new ArrayList<Integer>();
   scores.add(23);
   scores.add(46);
   scores.add(89);
   scores.add(123);
   System.out.println(scores);
  //How do we add a new item 67 to an array?
  scores.add(67);
  System.out.println(scores);


  //access the 3rd item in the ArrayList
  System.out.println(scores.get(2));

  //get size of ArrayList
  System.out.println(scores.size());

  //replace 3rd item with 17
  scores.set(2,17);
  System.out.println(scores);

  //remove 3rd item
  scores.remove(2);
  System.out.println(scores);

  }
}
