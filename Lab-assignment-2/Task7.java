//Task -7 
class Task7{
  public static void main(String [] args){
  int id = 22104199;
  int year = id/1000000;
  int num1 = id/100000;
  int num2 = num1%10;
  if(num2==1){
    System.out.println("Student joined BRAC in Spring " + year);
  }
  else if(num2==2){
      System.out.println("Student joined BRAC in Fall " + year);
  }
  else{
        System.out.println("Student joined BRAC in Summer " + year);
  }
  }
}