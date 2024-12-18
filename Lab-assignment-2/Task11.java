//Task - 11
class Task11{
  public static void main(String [] args){
  int money= 35;
  int gave= 500;
  
  if(gave>money){
    int hadToReturn = gave - money ;
         int tk100=0;
   int tk50=0;
   int tk20=0;
   int tk10=0;
   int tk5=0;
   int tk2=0;
   int tk1=0;
    while(hadToReturn>0){
   
    if(hadToReturn>=100){
      tk100 = hadToReturn/100;
      hadToReturn%=100;
    }
    else if(hadToReturn>=50){
      tk50 = hadToReturn/50;
      hadToReturn%=50;
    }
    else if(hadToReturn>=20){
     tk20 = hadToReturn/20;
      hadToReturn%=20;
    }
    else if(hadToReturn>=10){
    tk10 = hadToReturn/10;
      hadToReturn%=10;
    }
    else if(hadToReturn>=5){
  tk5 = hadToReturn/5;
      hadToReturn%=5;
    }
    else if(hadToReturn>=2){
    tk2 = hadToReturn/2;
      hadToReturn%=2;
    }
    else{
     tk1 = hadToReturn;
      hadToReturn%=1;
    }
  
    }
     System.out.println("The returned amount is " +hadToReturn+ " taka.");
     System.out.println("100 taka note: " + tk100);
     System.out.println("50 taka note: "+tk50);
     System.out.println("20 taka note: "+tk20);
     System.out.println("10 taka note: "+ tk10);
     System.out.println("5 taka coin: "+tk5);
     System.out.println("2 taka coin: "+tk2);
     System.out.println("1 taka coin: "+tk1);

  }
  else if(gave<money){
    int hadToPay = money - gave ;
    System.out.println("Please pay " + hadToPay + " taka more.");
  }
  else{
  System.out.println(" The returned amount is 0 taka.");
  }
  }
}