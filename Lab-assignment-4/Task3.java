//Task-3
import java.util.Scanner;
class Task3{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
     System.out.print("Enter an integer: ");
  int num1 = obj.nextInt();
  int pstvCount = 0;
  int negCount = 0;
  int count = 1;
    for(int i=num1;i>0;i--){
      System.out.print("Enter Number "+count+" : ");
      int num2 = obj.nextInt();
      if(num2>=0)pstvCount++;
        else negCount++;
      count++;  
    }
    System.out.println(pstvCount+" Non-negative Numbers");
    System.out.println(negCount+" Negative Numbers");
  }
}