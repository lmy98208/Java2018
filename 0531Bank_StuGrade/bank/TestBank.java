package bank;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank mybank=new Bank(10.3);
		System.out.println("�˻������ɹ�����ǰ��"+mybank.getbalawal());
		mybank.deposite(13.6);
		System.out.println("��"+mybank.getbalawal());
		try{
			mybank.withdraw(50.3);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try{
			mybank.withdraw(3.6);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
