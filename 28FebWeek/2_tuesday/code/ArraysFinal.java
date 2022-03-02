public class ArraysFinal{
  public static void main(String[] args){
    int[] scores = {23,46,89,123};
    // scores  = {23,46,89,123, 75};
    //How do we add a new item to an array?
    int[] scores2  = new int[5];
    for (int i=0; i <scores.length; i++){
      scores2[i] = scores[i];
    }
    scores2[4] = 75;
    scores = scores2;
    for(int score: scores){
      System.out.print(score+", ");
    }
  }
}
