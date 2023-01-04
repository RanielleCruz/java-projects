package SavingsAccount;

import java.util.*;

class SavingsAccount{
	private double balance;
	public static double interestRate = 0;
	
	SavingsAccount(){
		balance = 0;
	}
	
	public void setInterestRate(double newRate) {
		interestRate = newRate;
	}
	
	public static double getInterestRate() {
		return interestRate;
		
	}
	
	public  double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		balance = balance + amount;
	}
	
	double withdraw(double amount) {
		
		if(balance >= amount) {
			balance = balance - amount;
		}
		
		else {
			amount = 0;
		}
		
		return amount;
	}
	
	void addInterest(double interest) {			
		interest = balance * interestRate;	
		balance = balance + interest;
		
	}
	
	static void showBalance(SavingsAccount account) {
		System.out.println("Your new balance is " + account.getBalance());
		
	}
	
	
}

public class RunSavingsAccount {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		SavingsAccount savings = new SavingsAccount();
		double ir;
		
		System.out.print("Enter interest rate: ");
		ir = sn.nextDouble();
		savings.setInterestRate(ir);
		
		System.out.print("Enter deposit amount: ");
		double deposit = sn.nextDouble();
		savings.deposit(deposit);
		
		System.out.println("Your balance is " + savings.getBalance());
		
		System.out.print("Press D for another deposit or W to withdraw: ");
		sn.nextLine();
			
		if(sn.nextLine().equalsIgnoreCase("D")) {
			System.out.print("Enter deposit amount: ");
			deposit = sn.nextDouble();			
			savings.deposit(deposit);
			
			if(deposit > 999) {
				savings.addInterest(deposit);
				SavingsAccount.showBalance(savings);
			}
			
			else {
				SavingsAccount.showBalance(savings);
			}
			
		}
		
		else {
			System.out.print("Enter withdraw amount: ");
			deposit = sn.nextDouble();
			savings.withdraw(deposit);
			
			if(deposit > 999) {
				savings.addInterest(deposit);
				SavingsAccount.showBalance(savings);
			}
			
			else {
				SavingsAccount.showBalance(savings);
			}
		}
			
	}

}
