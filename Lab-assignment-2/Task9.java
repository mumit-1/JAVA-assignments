//Task - 9
class Task9{
  public static void main(String [] args){
  double a=26.45;
  double b=0.02;
  double c=13.56;
  double largest;
  double smallest;
  if(a>b && a>c){
    largest = a;
  }
  else if(b>a && b>c){
    largest = b;
  }
  else{
   largest = c;
  }
    if(a<b && a<c){
    smallest = a;
  }
  else if(b<a && b<c){
    smallest = b;
  }
  else{
   smallest = c;
  }
  System.out.println("Maximum number is "+largest);
    System.out.println("Minimum number is "+smallest);
  }
}