//Task-5
import java.util.Scanner;
class Task5{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
    System.out.print("N= ");
  int n = obj.nextInt();
  int[] array = new int[n];

  for(int i=0;i<n;i++){
   System.out.print("Enter a number: ");
   array[i] = obj.nextInt();
  }
  
  int num2 = obj.nextInt();
  boolean check = false;
   for(int i=0;i<n;i++){
     if( array[i]==num2 ){
       System.out.println(num2+" is at index "+i);
       check=true;
       break;
     }
     
  }
   if(check==false) System.out.println("Element not found");
  }
}