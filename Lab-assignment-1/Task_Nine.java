// Task - 18
import java.util.Scanner;
class Task_Nine{
  public static void main(String [] args){
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter number");
  int a = myObj.nextInt();
  int b = a % 10;
  int c = a / 10;
  int d = c % 10;
  System.out.println(b);
  System.out.println(d);
  }
}