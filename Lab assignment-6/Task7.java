//Task-7

class Task7{
  public static void main(String [] args){
//   int arr [] = {23,100,23,56,100};
    int arr [] = {-5,10,-7,-5};
    System.out.println("Input array: ");
   for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
     
    int[] array2 = new int[arr.length];
       
    for (int i = 0; i < arr.length; i++) {
      
      for (int j = i+1; j < arr.length; j++) {
        if(arr[i]==arr[j]){
          arr[j]=0;
        }
        }
      }
   
   System.out.println("New array: ");
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]!=0){
        System.out.print(arr[i]+" ");
      }
      
    }
    System.out.println();
  }
}
