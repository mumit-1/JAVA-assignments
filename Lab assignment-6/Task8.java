//Task-8
import java.util.Scanner;
class Task8{
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Please enter the length of the array 1: ");
    int n = obj.nextInt();
    int[] array1 = new int[n];
    System.out.println("Please enter the elements of the arr1: ");
    for(int i=0;i<array1.length;i++){
    array1[i]=obj.nextInt();
    }
    
     System.out.print("Please enter the length of the array 2: ");
     int n2 = obj.nextInt();
    int[] array2 = new int[n2];
    System.out.println("Please enter the elements of the arr2: ");
    for(int i=0;i<array2.length;i++){
    array2[i]=obj.nextInt();
    }
    int small = 0;
    if(n<n2){
      small = n;
    }
    else{
      small = n2;
    }
    int count = 0;
    for(int i=0;i<small;i++){
      if((array1[i]==array2[i])){
        count++;
      }
    }
    if(count>0) System.out.println("Array 2 is a subset of Array 1");
    else System.out.println("Array 2 is not a subset of Array 1.");
  }
}