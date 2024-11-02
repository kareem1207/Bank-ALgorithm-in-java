package SecondPkg;
import java.util.Scanner; 
public class BankAccountprogram {
    static double presentBalance;
    static int a;
    static int count;
    static int pin;
    static int upi;
    public static class bankAccountPin{
    	public static void pingenerater() {
    		Scanner s = new Scanner(System.in);
    		System.out.println("Enter how many digits your upi pin is it can be 4 or 6 ");
    		upi = s.nextInt();
    		if(upi==4 || upi == 6) {
    			System.out.println("Enter your bank pin (It should be of "+upi+" (it is according to your upi pin digits) digits only ) ");
    			 pin = s.nextInt() ;
    			a = pin;
       		 count = 0;
       		while(pin!=0) {
       			pin = pin/10;
       			count++;
       		}
       	if(count==upi) {
       		
       	}
       	while(count>upi || count<upi ) {
       		System.out.println("sorry system is shut offed");
       		break;
       	}
    		} while (upi !=4 && upi !=6) {
    			System.out.println("sorry system is shut offed");
    			break;
    		}
    		
    	}
    }
      public static class BankBalance{
    	public static void balance(double b) {
        System.out.println("Your current bank balance is "+b);
        presentBalance =b;
    	}
    	public static void withdrawamount(double b) {
    		Scanner s = new Scanner(System.in);
    		System.out.println("Enter amount you want to withdraw");
    	    double withdrawAmount = s.nextDouble();
    	    if (b>=withdrawAmount) {
    	    	 presentBalance = b-withdrawAmount;
    	    	System.out.println("Your current bank balance is "+presentBalance);
    	    }else {
    	    	double extraAmount = withdrawAmount-b;
    	    	presentBalance  = b;
    	    	System.out.println("Sorry your current balance is "+b+" but your trying to exceed by "+extraAmount);
    	    }
    	}
    	
    	public static void depositamount(double b) {
    		Scanner s = new Scanner(System.in);
    		System.out.println("Enter amount you want to deposite");
    	    double depositeAmount = s.nextDouble();
    	    	 presentBalance = b+depositeAmount;
    	    	System.out.println("Your current bank balance is "+presentBalance);
    	}
    } 
       public static void repeatOfProgram() {
   		Scanner s = new Scanner(System.in);
   		System.out.println("Enter your pin ");
   		 pin = s.nextInt();
   		pin :
   		if(pin==a) {
   		System.out.println("Choose an option ");
	    System.out.println(" 1 ---- check your bank balance");
	    System.out.println(" 2 ---- withdraw amount into your bank account");
	    System.out.println(" 3 ---- deposite amount into your account");
			int o = s.nextInt();
			if(o==1) {
				   BankBalance.balance(presentBalance);
					}
				   else if(o== 2){
		        	   BankBalance.withdrawamount(presentBalance);  
		           }
		           else if(o== 3){
		        	   BankBalance.depositamount(presentBalance);
		        	   
		           }else{
		        	   System.out.println("Sorry previous program is stopped "); 
		        	   }
   		}else {
   		System.out.println("sorry inncort pin");
   		break pin;
   		}
   		
   	} 
       public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =1;
			System.out.println("Enter your bank balance ");
			double a = s.nextDouble();
			bankAccountPin.pingenerater();
			pin :
			if(count==4 || count ==6) {
			System.out.println("Choose an option ");
		    System.out.println(" 1 ---- check your bank balance");
		    System.out.println(" 2 ---- withdraw amount into your bank account");
		    System.out.println(" 3 ---- deposite amount into your account");
			int o = s.nextInt();
			if(o==1) {
		   BankBalance.balance(a);
			}
		   else if(o== 2){
        	   BankBalance.withdrawamount(a);  
           }
           else if(o== 3){
        	   BankBalance.depositamount(a);
        	   
           }else{
        	   System.out.println("Sorry previous program is stopped and your current balance is "+a); 
        	   }
			account:
			while(n==1) { 
			System.out.println("Enter 1 for continuation or any number to stop ");
			 n = s.nextInt();
			 if(n==1) {
				 repeatOfProgram();
				 if (pin!=a) {
					 break account;
				 }
			 }else if(n>1|| n<1){
				 System.out.println("Thank you please visit again ");
				 break account;
			 }
				continue account;
		
	} }
			else {
				break pin;
			}
		}
   	}
 

