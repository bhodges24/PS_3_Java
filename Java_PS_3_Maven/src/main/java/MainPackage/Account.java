package MainPackage;

import java.util.Date;

public class Account {
//Create Account attributes
private int id = 0;
private double balance = 0;
private double annual_interest_rate = 0;
private Date date_created;

//Create no-argument Constructor that creates default Account Object
public Account(){
	this.date_created = new Date();
}

//Create Constructor that specifies "id" and "balance" initially
public Account(int initial_id, double initial_balance){
	this.id = initial_id;
	this.balance = initial_balance;
	this.date_created = new Date();
}

/*Create getters for attributes "id",  "balance", "date_created",
 * and "annual_interest_rate" */
public int getId(){
	return this.id;
}

public double getBalance(){
	return this.balance;
}

public double getAnnual_interest_rate(){
	return this.annual_interest_rate;
}

public Date getDate_created(){
	return this.date_created;
}

/*Create setters for attributes "id", "balance",and
* "annual_interest_rate" */
public void setId(int new_id){
	this.id = new_id;
}

public void setBalance(double new_balance){
	this.balance = new_balance;
}

public void setAnnual_interest_rate(double new_annual_interest_rate){
	this.annual_interest_rate = new_annual_interest_rate;
}

//Create get-method for Monthly Interest Rate
public double getMonthly_interest_rate(){
	return (getAnnual_interest_rate()/12);
}

//Create Withdraw method
public void withdraw(double withdrawal_amount)
	throws InsufficientFundsException{
	//Create Variable to hold balance
	//double balance = getBalance();
	
	//Sort Exceptions
	if (withdrawal_amount > balance){
		double amount_requested = (withdrawal_amount - balance);
		throw new InsufficientFundsException(amount_requested);
	}
	else{
		setBalance(balance - withdrawal_amount);
	}
}

//Create Deposit method
public void deposit(double deposit_amount){
	double new_balance = (getBalance() + deposit_amount);
	setBalance(new_balance);
}

//END CLASS
}
