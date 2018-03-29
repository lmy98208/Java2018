package java0329;

public class Test {
	public static void main(String[] args)
	{
		for(int i=1;i<3;i++){
			for(int j=3;j>0;j--){
				if(i==j)
					break;
				if(i%j==0)
					continue;
				System.out.println("i="+i+"j="+j);
			}
		}
	}
}
