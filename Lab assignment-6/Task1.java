//Task-1
import java.util.Scanner;
class Task1{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
    System.out.print("N= ");
  int n = obj.nextInt();
  int[] array = new int[n];

  for(int i=0;i<n;i++){
   System.out.print("Enter a number: ");
   array[i] = obj.nextInt();
  }
  System.out.print("Enter another number: ");
  int num2 = obj.nextInt();
  
  int[] array2 = new int[n+1];
  
   for(int i=0;i<(n+1);i++){
     if (i==n) array2[i] = num2;
     else array2[i] = array[i];
    
  }
   System.out.println("The elements of the array are:  ");
     for(int i=0;i<n;i++){
   System.out.println(i +": "+ array[i]+" ");
  }
   System.out.println("After resizing the array: ");
  for(int i=0;i<(n+1);i++){
   System.out.print(array2[i]+" ");
  }
  

    System.out.println(" ");
  }
}