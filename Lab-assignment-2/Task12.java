//Task - 12
class Task12{
  public static void main(String [] args){
      int a=230;
    int b=23;
    int c=5;
    if(a==b && b==c){
    System.out.println("All numbers are equal");
    }
    else if(a==b||a==c||b==c){
    System.out.println("Neither all are equal or different");    
    }
    else{
    System.out.println("All numbers are different");
    }
  }
}