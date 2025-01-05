//Task-4
import java.util.Scanner;
class Task4{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
    System.out.print("N= ");
  int n = obj.nextInt();
  int[] array = new int[n];

  for(int i=0;i<n;i++){
   array[i] = obj.nextInt();
  }
  System.out.println("Original array:");
   for(int i=0;i<n;i++){
     System.out.print(array[i]+" ");
  }
   System.out.println();
   System.out.println("After modifying: ");
   for(int i=0;i<n;i++){
     if(array[i]>0){
       System.out.print(1+" ");
     }
     else{
       System.out.print(0+" ");
     }
  }
   System.out.println();
  }
}