//Task - 13
import java.util.Scanner;
class Task_four{
  public static void main(String [] args){
  Scanner myObj = new Scanner(System.in);
    System.out.println("Enter number");
    int number = myObj.nextInt();
    int newNumber = number % 100;
    System.out.println("last two digit is :" + newNumber);
  }
}