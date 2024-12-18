//Task-6
import java.util.Scanner;
class Task6{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  String word = obj.nextLine();
  int length = word.length();
  String main ="";
  String second = "";
  for(int i=(length-1);i>=0;i--){
    
    int ascii = (int) word.charAt(i);
    if(ascii==32){
      
     for(int f=(second.length()-1);f>=0;f--){
      main+=second.charAt(f);
      }
      main+=(char) ascii;
       second="";
    }
    else{
      char single = (char) ascii;
      
      second+=single;
      
    }
  }
  for(int f=(second.length()-1);f>=0;f--){
      main+=second.charAt(f);
      }
  System.out.println(main);
  
}
}