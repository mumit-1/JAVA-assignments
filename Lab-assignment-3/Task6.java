//Task-6
class Task6{
  public static void main(String [] args){
    int sum = 0;
    int n=20;
    int extra =-1;
     for(int i=1;i<=n;i++){
      extra*=-1;
      sum+=(i*i*extra);
     }
    System.out.println(sum);
  }
}