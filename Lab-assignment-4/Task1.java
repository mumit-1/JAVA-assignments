//Task-1
import java.util.Scanner;
class Task1{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
  System.out.println("Enter how many numbers you want to give");
  int num1 = obj.nextInt();
  int max = -9999999;
  int min = 9999999;
  int sum = 0;
  int count = 0;
  for(int i=1;i<=num1;i++){
  System.out.println("Give the number");
  int num2 = obj.nextInt();
  
  if(num2%2==0 && num2>0){
  sum+=num2;
  count++;
  if(num2>max)max=num2;
  if(num2<min)min=num2;
  }
  }
  int avg = sum / count ;
  System.out.println("Max: " + max);
  System.out.println("Min: " + min);
  System.out.println("Average: " + avg);
  }
}