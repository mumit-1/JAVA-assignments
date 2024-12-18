//Task-8
import java.util.Scanner;
class Task8{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  int num1 = obj.nextInt();
  int num2 = obj.nextInt();
  for(int i=0;i<num2;i++){
    for(int a=1;a<=num1;a++){
    System.out.print(a+" ");
    }
    System.out.println(" ");
  }
  
  }
}