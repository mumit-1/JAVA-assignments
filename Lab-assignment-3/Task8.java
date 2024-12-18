//Task- 8
class Task8{
  public static void main(String [] args){
  int count = 1;
  int n=5;
  int sum=0;
   System.out.println("The odd numbers are:  ");
  for(int i=1;count<=n;i++){
    if(i%2==1){
   
    count++;
    System.out.println(i);
    sum+=i;
    }
  }
  System.out.println("The Sum of odd Natural Numbers up to "+n+" terms is: "+sum);
  }
}