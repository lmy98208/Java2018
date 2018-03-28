package cosX;

import java.util.Scanner;

public class TaylorsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入x:");
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble();
		System.out.print("cos("+x+")=");
		double outcome=Taylor(x);
		System.out.format("%.6f",outcome); //格式化输出，精确到0.000 001
		System.out.println();

	}
	public static double Taylor(double x){
		int i,k;
		long fac=1;//阶乘
		double n=1,y=1,sum=1;
		for(i=2;(Math.abs(y))>=1e-10;i=i+2)//绝对值公式abs()
		{	
			n=n*(-1);
			for(k=1;k<=i;k++)
				{
				fac=fac*k;
				}
			y=Math.pow(x, i)*n/fac;//每一项的和
			sum=sum+y;
			fac=1;//重新置1
		}
		return sum;	
	}

}
