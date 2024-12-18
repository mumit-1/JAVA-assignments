//Task-2
import java.util.Scanner;
class Task2{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  String word = obj.nextLine();
  String a=""; 
  String b="";
  int num1 = word.length();
  for(int i=(num1-1);i>=((num1+1)/2);i--){
    int ascii = (int) word.charAt(i);
    if(97<=ascii && ascii<=122){
      char aX = (char) ascii;
      a+= aX;
    }
    else{
     ascii+=32;
           char aX = (char) ascii;
      a+= aX;
    }
  }
    for(int i=0;i<((num1/2));i++){
    int ascii = (int) word.charAt(i);
    if(97<=ascii && ascii<=122 ){
      char bX = (char) ascii;
      b+=bX;
      
    }
      else{
         ascii+=32;
           char bX = (char) ascii;
      b+= bX;
      }
    
    }
      if(a.equals(b)) System.out.println(true);
        else System.out.println(false);
        obj.close();
  }
}

