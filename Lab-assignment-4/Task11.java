//Task-11
import java.util.Scanner;
class Task11{
public static void main (String [] args){
Scanner obj = new Scanner(System.in);
System.out.print("Start :");
int num1 = obj.nextInt();
System.out.print("End :");
int num2 = obj.nextInt();
int count = 0;
for(int i=num1;i<=num2;i++){
  int sum = 0;
  int apple = i; 
  while(apple>0){
    int digitLast = apple % 10;
    apple=apple/10;
    sum = sum + (digitLast * digitLast * digitLast);
  }
   
  if(sum==i){
    count++;
   if(count==1) System.out.println("Armstrong Numbers: ");
    System.out.println(i); 
}
}
}
}