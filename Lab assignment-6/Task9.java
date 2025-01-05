//Task - 9

import java.util.Scanner;
class Task9{
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("N= ");
    int n = obj.nextInt();
    int[] array1 = new int[n];
    
    for(int i=0;i<array1.length;i++){
      System.out.print("Enter a number: ");
    array1[i]=obj.nextInt();
    }
    System.out.println("Original Array: ");
    for(int i=0;i<array1.length;i++){
      System.out.print(array1[i]+" ");
    }
    for(int i=0;i<array1.length;i++){
      for(int k=i+1;k<array1.length;k++){
        if(array1[i]<array1[k]){
          int x = array1[i];
          array1[i]=array1[k];
          array1[k]=x;
          
        }
      }
    }
    System.out.println();
    System.out.println("Sorted Array: ");
      for(int i=0;i<array1.length;i++){
      System.out.print(array1[i]+" ");
    }
    System.out.println();
  }
}