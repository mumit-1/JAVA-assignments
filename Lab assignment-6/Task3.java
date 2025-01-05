//Task-3
import java.util.Scanner;
class Task3{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
  int n = obj.nextInt();
  int[] array = new int[n];
    for(int i=0;i<n;i++){
   System.out.print("Enter a number: ");
   array[i] = obj.nextInt();
  }
  int[] array2 = new int[n];
  int k = 0;
   for(int i=(n-1);i>=0;i--){
     
     
     array2[i] = array[k];
     
     k++;
  }
   System.out.println("Reversed using a new array:");
    for(int i=0;i<array2.length;i++){
      System.out.print(array2[i]+" ");
    }
    System.out.println("");
     int x=(array.length-1);
    for(int i=0;i<(array.length/2);i++){
     
        int num;
        num=array[i];
        array[i]=array[x];
        array[x]=num;
        x--;
     
    }
    System.out.println("Reversed the original array:");
     for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
     System.out.println("");
  }
}