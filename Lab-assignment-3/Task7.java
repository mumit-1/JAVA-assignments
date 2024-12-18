//Task-7
class Task7{
  public static void main(String [] main){
  int n=6;
  int count=0;
  System.out.println("Divisors of :" + n);
  for(int i=1;i<=n;i++){
    if(n%i==0){
      count++;
    System.out.println(i);
    }
  }
  System.out.println("Total Divisors: "+count);
  }
}