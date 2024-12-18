//Task-09
import java.util.Scanner;
class Task9{
  public static void main(String [] args){
  Scanner obj = new Scanner (System.in);
  String word = obj.nextLine();
  
  boolean eight =false;
  boolean small =false;
  boolean big =false;
  boolean num =false;
  boolean special =false;
  if(word.length()>=8){
    eight = true;
  for(int i=0;i<(word.length());i++){
    int ascii = (int) word.charAt(i);
    if(ascii>=33 && ascii<=126){
    if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)){
    if(ascii>=65&&ascii<=90){
      int count = 0;
    count++;
    if(count>0){
      big=true;
    }
    }
    if(ascii>=97&&ascii<=122){
      int count = 0;
    count++;
    if(count>0){
      small=true;
    }
    }
      if(ascii>=48&&ascii<=57){
        int count = 0;
    count++;
    if(count>0){
      num=true;
    }
    }
  }
    else{
      int count = 0;
    count++;
    if(count>0){
      special=true;
    }
    
    }
  }
  }
  }
  System.out.println(eight && big && small && num && special);
  }
}