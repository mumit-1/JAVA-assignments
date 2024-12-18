//Task - 4
import java.util.Scanner;
class Task4{
  public static void main(String [] args){
  Scanner myObj = new Scanner (System.in);
  int y = myObj.nextInt();
  if ((y%4 == 0 && y%100!=0) || (y%400==0)){
    System.out.println("Year is leapyear");
  }
  else{
    System.out.println("Year is not leap year");
  }
  }
}