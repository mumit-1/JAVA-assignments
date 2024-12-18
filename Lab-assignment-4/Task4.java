//Task - 4
import java.util.Scanner;
class Task4{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter Number :");
  int  num1 = obj.nextInt();
 
 
     
  if(num1>0){
    for(int a=2;a<=100;a++){
        if(num1>0){
      int count = 0;
      for(int b=2;b<=9;b++){
        if(a%b==0){
          count++;
        }
    }
      if(count<=1){
        System.out.println(a);
        num1--;
      }
  }
  }
  }
}
}