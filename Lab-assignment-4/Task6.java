//Task - 6
import java.util.Scanner;
class Task6{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter Number :");
  int  num1 = obj.nextInt();
  int count=1;
  while(num1%2==0 && num1>0)
  {
 
    count = 1;
  for(int i=2;i<=num1;i++){
    
    
    if(num1%i==0) count++;
   
      
  }
  if(num1%2==0) System.out.println(num1 + " has " + count + " divisors");
     System.out.print("Enter Number :");
  num1 = obj.nextInt();
  }
  }
}
