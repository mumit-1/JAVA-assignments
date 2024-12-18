//Task - 8
class Task8{
  public static void main(String [] args){
  int salary = 12000;
  int age = 19;
  double tax;
  if(age>=18 && salary>=10000){
    if(salary<=20000){
      tax = (salary*(5.0/100));
      System.out.println("Your Tax amounts in " + (int)tax + " Tk");
    }
    else{
    tax = (salary*(10.0/100));
          System.out.println("Your Tax amounts in " + (int)tax + " Tk");
    }
  }
  else{
    System.out.println("Your Tax amounts in 0 Tk");
  }
  }
}