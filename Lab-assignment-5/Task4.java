//Task-4
import java.util.Scanner;
class Task4{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  String word = obj.nextLine();
  int length = word.length();
  for(int i=(length-1);i>=0;i--){
   System.out.print(word.charAt(i));
  }
  System.out.println(" ");
  }
}