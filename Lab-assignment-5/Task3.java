//task-3
import java.util.Scanner;
class Task3{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
  String word = obj.nextLine();
  String split = obj.next();
  int length = word.length();
  for(int i=0;i<(length);i++){
    int ascii = (int) word.charAt(i);
    int ascii2 = (int) split.charAt(0);
    if(ascii==ascii2){
      System.out.println(" ");
    }
    else{
      System.out.print(word.charAt(i));
    }
  }
  System.out.println(" ");
  }
}