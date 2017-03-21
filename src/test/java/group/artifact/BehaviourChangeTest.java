package group.artifact;

import org.junit.Test;

import junit.framework.Assert;

public class BehaviourChangeTest {
	
	@Test
	public void depositIfCoverage() {
		System.out.println("running deposit if coverage"); 
		BankAccount acc = new BankAccount();
		boolean result = acc.deposit(10.00); 
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void depositElseCoverage() {
		System.out.println("running deposit else coverage"); 
		BankAccount acc = new BankAccount();
		boolean result = acc.deposit(-10.00); 
		Assert.assertEquals(result, false);
	}
	
	
	@Test
	public void afterMutation() {
		System.out.println("running after mutation"); 
		BankAccount acc = new BankAccount();
		acc.deposit(10.00); 
		boolean result = acc.withdraw(10.00);
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void flagTestSequence() {
		System.out.println("running flag test sequence"); 
		BankAccount acc = new BankAccount();
		acc.deposit(10.00); 
		acc.withdraw(20.00);  
		acc.deposit(50.00);
		boolean result = acc.withdraw(20.00); 
		Assert.assertEquals(result, true);
	}
	
}
