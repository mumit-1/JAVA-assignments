//Task - 6
class Task6{
  public static void main(String [] args){
  int num = -2;
  int result; 
  if(num<0){
  result=(2*num);
  }
  else if(num>=0 && num<2){
    result = num+1;
  }
  else if(num>=2 && num<5){
  result = ((num*num)-1);
  }
  else{
  result = (3*(num*num)+2);
  }
  System.out.println(result);
  }
}