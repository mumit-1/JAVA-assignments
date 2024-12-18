//Task - 1
class Task1{
  public static void main(String[] args){
  int num1=5;
  int num2=7;
  int num3=-5;
  if(num1>num2 && num1>num3){
    System.out.println("largest number: " + num1);
  }
  else if(num2>num3 && num2>num1){
    System.out.println("largest number: " + num2);
  }
  else{
    System.out.println("largest number: " + num3);
  }
  }
}