//Task - 15
class Task15{
  public static void main(String [] main){
  int n=6;
    int sum=0;
for(int i=1;i<=n;i++){
  if(n%i==0 && n!=i){
      System.out.println(i);
      sum+=i;
  }
}
if(sum==n) System.out.println(n+" is a perfect number");
else System.out.println(n+" is not a perfect number");
  }
}