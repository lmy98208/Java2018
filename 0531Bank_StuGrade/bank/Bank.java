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
		System.out.println(amount+"���ɹ���");
	}
	public void withdraw(double amount)
			throws IllegalBalanceException
	{
		if(balance<amount)
		{
			throw new IllegalBalanceException("���㣬ȡ��ʧ�ܣ�");
		}
		else{
			balance-=amount;
			System.out.println(amount+"ȡ��ɹ���");
		}
	}
	public double getbalawal()
	{
		return balance;
	}
}
