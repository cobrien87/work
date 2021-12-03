public class Review{
  public static int foo(int x){
    int y = 3*x;
    return (int) Math.pow( (double) y,3);
  }

  public static double bar(double x){
    double y = Math.pow(x,3);
    return 3*y;
  }

  public static void main(String[] args){
    int w = 5;
    int x = foo(w);
    double y = bar(x);
    int z = foo( (int) y);
    System.out.println("z = " + z);
  }

}
