//Task - 10
class Task10{
  public static void main(String [] args){
    int a=1;
    int b=6;
    int c=5;
    if(a==b && b==c){
    System.out.println("This is a Equilateral triangle");
    }
    else if(a==b||a==c||b==c){
    System.out.println("This is a Isosceles triangle");    
    }
    else{
    System.out.println("This is a Scalene triangle");
    }
  }
}