//Task-10
import java.util.Scanner;
class Task10{
public static void main(String [] args){
Scanner obj = new Scanner(System.in);
int num = obj.nextInt();
int count=num;
 int space = num--;
 int x=1;
for(int i=count;i>0;i--){
//      int space = num--;
for(int a=0;a<space;a++){
System.out.print(" ");
}
    for(int b=1;b<=x;b++){
    System.out.print(b);
  }
 space--;
   x+=2;
 System.out.println(" ");
}
}
}