package Frist;

public class GetPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=100,finish=200,num=10;
		boolean flag;
		int m,p,count=0;
		for(m=start;m<=finish;m++){
			flag=true;
			for(p=2;p<=m/2;p++)
				if(m%p==0){
					flag=false;
					break;
					}
			if(flag)
			{
				System.out.print(m+"\t");
				count++;
				if(count%num==0)//控制输出格式
					System.out.println();
			}
		}
	}

}
