//Task - 3
import java.util.Scanner;
class Task3{
  public static void main(String [] mian){
  Scanner newObj = new Scanner (System.in);
  int num = newObj.nextInt();
  if(num%5==0 && num%7==0){
    System.out.println("Divisble by both");
  }
  else if(num%5==0 ){
  System.out.println("Divisble by 5");
  }
   else if(num%7==0){
  System.out.println("Divisble by 7");
  }
   else{
   System.out.println("No");
   }
  }
}