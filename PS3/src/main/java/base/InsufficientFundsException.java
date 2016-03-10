package base;

import java.io.*;
	
	public class InsufficientFundsException extends Exception {
	   private double amount;
	   
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	      System.out.println("Insufficient Funds Available: Try Again");
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
}