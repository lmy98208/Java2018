package cosX;

import java.util.Scanner;

public class TaylorsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����x:");
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble();
		System.out.print("cos("+x+")=");
		double outcome=Taylor(x);
		System.out.format("%.6f",outcome); //��ʽ���������ȷ��0.000 001
		System.out.println();

	}
	public static double Taylor(double x){
		int i,k;
		long fac=1;//�׳�
		double n=1,y=1,sum=1;
		for(i=2;(Math.abs(y))>=1e-10;i=i+2)//����ֵ��ʽabs()
		{	
			n=n*(-1);
			for(k=1;k<=i;k++)
				{
				fac=fac*k;
				}
			y=Math.pow(x, i)*n/fac;//ÿһ��ĺ�
			sum=sum+y;
			fac=1;//������1
		}
		return sum;	
	}

}
