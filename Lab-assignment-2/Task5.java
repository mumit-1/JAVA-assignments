//Task - 5
import java.util.Scanner;
class Task5{
  public static void main(String [] args){
    Scanner myObj = new Scanner (System.in);
    int num = myObj.nextInt();
    if(num>0){
      if(num%2==0){
      System.out.println("Number is positive and even");
      }
      else{
      System.out.println("Number is positive and odd");
      }
    }
    else if(num<0){
    System.out.println("Number is negative");
    }
    else{
      System.out.println("Number is zero");
    }
  }
}