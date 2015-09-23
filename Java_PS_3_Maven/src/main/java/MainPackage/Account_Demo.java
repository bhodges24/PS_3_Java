package MainPackage;

public class Account_Demo {
	public static void main(String[] args)throws InsufficientFundsException{
		//Create new instance of account with ID 1122 and Balance $20000.00
		Account my_account = new Account(1122, 20000.00);
		
		//Set Balance
		my_account.setAnnual_interest_rate(.045);
		
		//Perform deposit
		my_account.deposit(3000.00);
		
		//Attempt Withdrawals
		try{
			my_account.withdraw(2500.00);
			my_account.withdraw(22000.00);
		}catch(InsufficientFundsException ex){
			System.out.printf("Sorry but you are short $%,.2f",
					ex.getAmount());
			ex.printStackTrace();
		}
		
		//Print Account Details
		System.out.printf("New account has id number %d", my_account.getId());
		System.out.printf(" balance $%,.2f", my_account.getBalance());
		System.out.printf(" and monthly interest rate %f", 
			(my_account.getAnnual_interest_rate()/12));
		System.out.printf(" and was created on %s", 
			my_account.getDate_created());
		
	}
}
