//Task-01
import java.util.Scanner;
class Task1{
  public static void main(String [] args){
  Scanner obj = new Scanner(System.in);
  String word = obj.nextLine();
  for(int i=0;i<word.length();i++){
    
    int ascii = (int) word.charAt(i);
    if((97<=ascii) && (ascii<=122)){
      ascii -=32;
    char word2 = (char) ascii ;
    System.out.print(word2);
  }
    else{
    System.out.print(word.charAt(i));
    }
  }
  System.out.println(" ");
 
}
}  