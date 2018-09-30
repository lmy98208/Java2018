package bank;

public class Bank {
	private double balance=0;
	Bank(double balance)
	{
		this.balance=balance;
	}
	public void deposite(double amount)
	{
		balance+=amount;
		System.out.println(amount+"存款成功！");
	}
	public void withdraw(double amount)
			throws IllegalBalanceException
	{
		if(balance<amount)
		{
			throw new IllegalBalanceException("余额不足，取款失败！");
		}
		else{
			balance-=amount;
			System.out.println(amount+"取款成功！");
		}
	}
	public double getbalawal()
	{
		return balance;
	}
}
