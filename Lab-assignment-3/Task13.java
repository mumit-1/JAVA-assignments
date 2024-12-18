class Task13{
  public static void main(String [] args){
    int n = 32768;
  int use1 = n;
  int use2 = n;
  int count = 0;
  while(use1>0){
    count++;
    use1/=10;
  }
  System.out.println(count);
 
   int need = 1;
  for(int i=1;i<count;i++){
   need*=10;
  }
  
  int count2=0;
  while(use2>0){
   int result=use2/need;
    use2%=need;
    need/=10;
     count2++;
     
   if(count!=count2)System.out.print(result+",");
   else System.out.print(result);
  }
}
}