package calArea;

public class MyTriangle implements Shape{
	private float angle1;
	private float angle2;
	private float angle3;
	MyTriangle(float a,float b,float c)
	{
		if((a+b>c)&&(a+c>b)&&(c+b)>a)//两边之和大于第三边，构造三角形
		{
			angle1=a;
			angle2=b;
			angle3=c;
		}
		else{//否则构造等边三角形
			float min=a;
			if(b<min) min=b;
			if(c<min) min=c;
			angle1=angle2=angle3=min;
		}
	}
	public double area()
	{
		double p=(angle1+angle2+angle3)/2;
		return Math.sqrt(p*(p-angle1)*(p-angle2)*(p-angle3));
	}
}
