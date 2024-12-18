//Task-08
import java.util.Scanner;
class Task8{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
  String word = obj.nextLine();
  int count = 1;
  String result ="";
  for(int i=0;i<word.length();i++){
  int ascii = (int) word.charAt(i);
  if((ascii>=97 && ascii<=122) || (ascii>=97-32 && ascii<=122-32)){
    if(count==1){
      if((ascii>=97 && ascii<=122)){
      result+= (char) ascii;
     
      }
      else{
      result+= (char) (ascii+32);
      
      }
      count*=(-1);
    }
    else{
      if((ascii>=97 && ascii<=122)){
      result+= (char) (ascii-32);
      
      }
      else{
      result+= (char) ascii;
      
      }
      count*=(-1);
    }
  }
  else{
  result+= (char) ascii;
  }
  }
  System.out.println(result);
  }
}