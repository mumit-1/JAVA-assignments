//Task-7
import java.util.Scanner;
class Task7{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  int num1 = obj.nextInt();
 

  for(int i=1;i<=num1;i++){
     int count = 0;
    int sum = 0;
  int num2 = obj.nextInt();
  int num3 =obj.nextInt();
  for(int a=num2;count<num3;a++){
    if(!(a%2==0)){
      count++;
      sum+=a;
  }
 
  }
   System.out.println(sum);
  }
  }
}