//Task-07
import java.util.Scanner;
class Task7{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
  String word = obj.nextLine();
  String word2 = obj.nextLine();
  String word3 = "";
  int n = 0;
  while(n<2){
  for(int i=0;i<(word.length());i++){
  int a = (int) word.charAt(i);
  int count=0;
  for(int k=0;k<(word2.length());k++){
    int b = (int) word2.charAt(k);
    
    if(b==a){
      count++;  
    }
    
  }
  if(count==0){
    if(a>=97 && a<=122){
    word3+= (char) (a-32) ;
    }
    else{
    word3+= (char)a ;
    }
  }
  }
  n++;
 
  String wordNeed = word;
   word = word2;
  word2 = wordNeed;
  }
  
  System.out.println(word3);
  }
}