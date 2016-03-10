package base;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double deposit(double depositAmount) {
		setBalance(balance + depositAmount);
		return getBalance();
	}
	public double withdraw(double withdrawAmount) throws InsufficientFundsException {
		if (withdrawAmount <= balance) {
		setBalance(balance - withdrawAmount);
		return getBalance();
		}
		else {
			double amount = withdrawAmount - balance;
			throw new InsufficientFundsException(amount);
		}
		
	}
}