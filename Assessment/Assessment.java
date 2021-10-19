
/*
Draw a complete stack frame diagram for the problem below.
*/
public class Assessment{
  public static double quadratic(double a, double b, double c, double x){
    double y = a*Math.pow(x,2) + b*x + c;
    return y;
  }
  public static double quad_sqrt(double a, double b, double c, double x){
    double y = quadratic(a,b,c,x);
    return Math.sqrt(y);
  }
  public static void main(String[] args){
    double a = 3;
    double b = 5;
    double c = -8;
    double x = 3;
    a = quadratic(a,b,c,x);
    b = quad_sqrt(a,b,c,x);
  }
}
