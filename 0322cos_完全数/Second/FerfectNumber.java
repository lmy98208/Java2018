package Second;

public class FerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Perfect Numbers between 1 and 1000 are: ");
		for(int num=1;num<=1000;num++)
		{
			int i=1,sum=0;//每一次循环之前都要清零、置一
			for(;i<num/2+1;i++)
			{
				if(num%i==0)
					sum=sum+i;
			}
			if(sum==num)
				System.out.print(num+"\t");
		}
	}

}
