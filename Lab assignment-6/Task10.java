//Task - 10

class Task10{
  public static void main(String [] args){
    int [] array1 = {100, 47, 85, 94, 5, 50};
    String [] array2 = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};
    
  
    for(int i=0;i<array1.length;i++){
      for(int k=i+1;k<array1.length;k++){
        if(array1[i]>array1[k]){
          int x = array1[i];
          array1[i]=array1[k];
          array1[k]=x;
          String y = array2[i];
          array2[i]=array2[k];
          array2[k]=y;
        }
      }
    }
   
    System.out.println("Sorted Array: ");
      for(int i=0;i<array1.length;i++){
      System.out.print(array1[i]+" ");
    }
      System.out.println();
        for(int i=0;i<array2.length;i++){
      System.out.print(array2[i]+" ");
    }
    System.out.println();
  }
}