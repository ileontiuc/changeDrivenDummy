package group.artifact;


public class BankAccount {
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
	
	
	public boolean withdraw(double amount) {
		if (amount <= 0){ 
			 System.out.println("amount cannot be negative");
			 return false; 
		}
		
		if(isOverdraft == true){
			System.out.println("account is overdraft");
			return false; 
		}
		balance = balance - amount;
		if (balance < 0){ 
			 isOverdraft = true; 
		}
		return true;
	} 
}
