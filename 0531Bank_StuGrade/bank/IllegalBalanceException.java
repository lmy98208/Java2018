package bank;

public class IllegalBalanceException extends Exception {
	public IllegalBalanceException()
	{
		super();
	}
	public IllegalBalanceException(String message)
	{
		super(message);
	}
}
