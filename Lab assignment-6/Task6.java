//Task-6
import java.util.Scanner;
class Task6{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
  int n = obj.nextInt();
  double[] array = new double[n];

  for(int i=0;i<n;i++){
   System.out.print("Enter a number: ");
   array[i] = obj.nextDouble();
  }
  double sum=0.0;
  double max = array[0];
  int indexMax=0;
  for(int i=0;i<n;i++){
    if(max<array[i]){
      max=array[i];
      indexMax=i;
    }
    sum+=array[i];
  }
  double min = array[0];
  int indexMin=0;
  for(int i=0;i<n;i++){
    if(min>array[i]){
      min=array[i];
      indexMin=i;
    }
  }
  double avg = sum / n;
  System.out.println("Maximum element "+max+" found at index "+indexMax);
  System.out.println("Minimum elemen "+min+" found at index "+indexMin);
  System.out.printf("Summation: %.2f",sum);
  System.out.println();
  System.out.printf("Average: %.2f",avg);
  System.out.println();
  }
}