package MainPackage;

public class InsufficientFundsException extends Exception {
	//Create new amount variable
	private double amount;

	//Create new instance of Insufficient Funds Exception
public	InsufficientFundsException(double requested_amount){
		this.amount = requested_amount;
	}
	

	//Create getter for variable amount
	public double getAmount(){
		return amount;
	}
}
