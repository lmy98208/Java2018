package Second;

import java.math.*;

public class ConditionalJudgment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i=1.9;
		System.out.println("input:"+i);
		double outcome;
		
		System.out.println("\nIF_case");
		if((i>=0)&&(i<1))
			outcome=i*i-1;
		else if((i>=1)&&(i<3))
			outcome=i*i-2*i-2;
		else if((i>=3)&&(i<5))
			outcome=i*i-i*Math.sin(i);
		else if((i>=5)&&(i<7))
				outcome=i+1;
		else outcome=i-1;
		System.out.println("output:"+outcome);
		
		System.out.println("\nSWITCH_case");
		int num=(int)i;//将double强制转换为int，可以获得取整的效果
		//System.out.println(num);
		switch(num)
		{
		case 0: 
			outcome=i*i-1;
			break;
		case 1:
			outcome=i*i-2*i-2;
			break;
		case 2:
			outcome=i*i-2*i-2;
			break;
		case 3:
			outcome=i*i-i*Math.sin(i);
			break;
		case 4:
			outcome=i*i-i*Math.sin(i);
			break;
		case 5:
			outcome=i+1;
			break;
		case 6:
			outcome=i+1;
			break;
		default:
			outcome=i-1;
			break;
		}
		System.out.println("output:"+outcome);
	}

}
