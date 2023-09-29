import java.util.*;

  
  class Bank{
 
     public static void main(String []args){
		 Bank b1=new Bank();
       Scanner sc = new Scanner(System.in);
       Account a1=new Account();

	Account.bankName="Hdfc";
	Account.ifsc="Hdfc123";

     System.out.println("Enter the Account number");
	a1.accNo=sc.nextLong();

	System.out.print("Enter the Account holder name");
    a1.accHName=sc.nextLine();

	System.out.println("Enter your current balance");
     a1.balance=sc.nextDouble();
	
	b1.display();

	}
	 void display(){
		System.out.println("Bank name"+Account.bankName);
		System.out.println("Bank ifsc "+Account.ifsc);
		
		//System.out.println("Account Number "+accNo);
	//	System.out.println("Account Holdet Name "+accHName);
		//System.out.println("Balance"+balance);


	}

}

