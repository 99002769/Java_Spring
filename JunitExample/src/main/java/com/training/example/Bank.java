package com.training.example;

public class Bank {

	Double balance;

	public Bank(Double balance) {
		super();
		this.balance = balance;
	}
	
	public double deposit(Double amount) throws ExceedingException
	{
		if(amount<=0)
		{
			throw new NegativeValueException("Amount Not be Negative");
		}

		if(amount>=4000)
		{
			throw new ExceedingException("Amount beyond limit");
		}
		balance = balance+amount;
		return balance;
		
	}
	
	public double withdraw(Double amount) throws ExceedingException
	{
		if(amount>=4000 || amount==balance)
		{
			throw new ExceedingException("Amount beyond limit");
		}
		if(amount<=0)
		{
			throw new NegativeValueException("Amount Not be Negative");
		}
		balance = balance-amount;
		return balance;
		
	}
	
	public double Average(int x,int y,int z) throws ExceedingException {
		if(x<0 || y<0 ||z<0)
		{
			throw new NegativeValueException("x,y,z Not be Negative");
		}
		Double sum = (double) (x+y+z);
		Double average =sum/3;
		if(sum>300)
		{
			throw new ExceedingException("sum beyond limit");
		}
		return average;
		
	}
}
