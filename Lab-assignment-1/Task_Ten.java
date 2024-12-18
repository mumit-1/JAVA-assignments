// Task - 19
import java.lang.Math;
class Tast_Ten{
  public static void main(String [] args){
  int a = 8;
  int b = 3;
  int calc1 = (((a/2) * (a/2)) + (3 * 3));
  double calc2 = Math.sqrt(calc1);
  double area1 = calc2 * a ;
  double area2 = (0.5) * b * a ;
  System.out.println((area2*2)+area1);
  }
}