class Task_Eleven{
  public static void main(String [] args){
  double a= 4.5;
  double b= 9.5;
  double calc1 = (((a/2) * (a/2)) + (3 * 3));
  double c = Math.sqrt(calc1);
  double sinA= (a/c);
  double sinB= (b/c);
  double cosA= (b/c);
  double cosB= (a/c);
  System.out.println("sinA: "+sinA);
    System.out.println("sinB: "+sinB);
      System.out.println("cosA: "+cosA);
        System.out.println("cosB: "+cosB);
  }
}