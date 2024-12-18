// Task - 14
import java.util.Scanner;
class Text_Five{
  public static void main (String [] args){
   Scanner myObj = new Scanner(System.in);
   System.out.println("Given a value for inch:");
   double number = myObj.nextInt();
   double newNumber = number * 0.0254 ;
   System.out.println(number +" inch is " + newNumber);
  }
}