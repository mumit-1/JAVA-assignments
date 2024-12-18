//Task - 16
import java.util.Scanner;
class Task_Seven{
  public static void main (String [] args){
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter minute");
  int number = myObj.nextInt();
  int year = number / 525600;
  int putting = number % 525600;
  int days = putting / 1440;
  System.out.println(number + " minutes is approximately "+year+" years and "+days+" days");
  }
}