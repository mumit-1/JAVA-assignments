//Task - 2
import java.util.Scanner;
class Task2{
  public static void main(String [] args){
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter the number");
  int num1= myObj.nextInt();
  if(num1>=90){
      System.out.println("Your grade is A");
  }
  else if(num1>=85){
    System.out.println("Your grade is A-");
  }
  
  else if(num1>=70){
    System.out.println("Your grade is B");
  }
  
  else if(num1>=57){
    System.out.println("Your grade is C");
  }
  
  else if(num1>=50){
    System.out.println("Your grade is D");
  }
  else{
  System.out.println("Your grade is F");
  }
  }
}