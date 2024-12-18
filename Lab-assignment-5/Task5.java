//Task-5
import java.util.Scanner;
class Task5{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  String word = obj.nextLine();
  int length = word.length();
  String vowel = "";
  String cons = "";
  for(int i=(length-1);i>=0;i--){
   int x = (int) word.charAt(i);
   if((x>=97 && x<=122) || (x<=(122-32) && x>=(97-32))){
     if(x==97 || x==101 || x==105 || x==111 || x==117 || x==97-32 || x==101-32 || x==105-32 || x==111-32 || x==117-32){
     char single = (char) x;
      vowel+=single;
      
   }
   else{
   char single = (char) x;
      cons+=single;
      
   }
    
  }
  }
  
  if(((vowel.length())%3==0)&&((cons.length())%5==0)){
  if(((vowel.length())>0 && (cons.length())>0)){
  System.out.println("Aaarr! Me Plunder!!");
  }
   else{
  System.out.println("Blimey! No Plunder!!");
  }
  }
  else{
  System.out.println("Blimey! No Plunder!!");
  }
  
}
}