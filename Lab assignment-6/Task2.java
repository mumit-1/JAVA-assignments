//Task-2

class Task2{
  public static void main(String [] args){
    int[] array = {9, -5, 7, 9, -5, 5, 7};
    System.out.println("Before removing duplicates:");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println(" ");
    for(int i=0;i<array.length;i++){
      for(int k=(i+1);k<array.length;k++){
        if(array[i]==array[k]){
          array[k]=0;
        }
      }
    }
    System.out.println("After replacing duplicates with 0:");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println(" ");
  }
}