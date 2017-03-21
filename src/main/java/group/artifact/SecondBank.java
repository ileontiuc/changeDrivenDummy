package group.artifact;

public class SecondBank {

	private double balance;
	private boolean isOverdraft = false;
	
	public boolean deposit(double amount) {
		if (amount >= 0.00) { 
			balance = balance + amount;
			if(balance > 0.00){
				isOverdraft = false;
			}
			return true; 
		}else{
			System.out.println("amount cannot be negative"); 
			return false;
		} 
	} 
	
	
	
}
