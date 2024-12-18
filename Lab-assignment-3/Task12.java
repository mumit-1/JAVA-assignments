//Task - 12
class Task12{
  public static void main(String [] args){
  int n = 1234;
  int use1 = n;
  int use2 = n;
  int count = 0;
  while(use1>0){
    count++;
    use1/=10;
  }
  int count2 =0;
  while(use2>0){
  int result = use2%10;
  count2++;
  use2/=10;
  if(count!=count2)System.out.print(result+",");
  else System.out.print(result);
  }
  }
}