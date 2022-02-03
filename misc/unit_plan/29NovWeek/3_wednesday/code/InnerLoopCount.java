public class InnerLoopCount{

  public static void main(String[] args){
    //int count = 0;
    int max_m = 2;
    int max_n = 3;
    for (int m = 0; m < max_m; m++){
      System.out.println("m = " + m);
      for (int n = 0; n < max_n; n++){
        System.out.println("n = " + n);
        System.out.println("m*n = " + (m*n));
      }// end inner loop
    }//end outer loop

    int max_m = 2;
    int max_n = 3;
    int count = 0;
    for (int m = 0; m < max_m; m++){
      for (int n = 0; n < max_n; n++){
        count++;
      }// end inner loop
    }//end outer loop
    System.out.print(count);


 s 
    //System.out.print("count: " + count);
  }//end main
}// end class
