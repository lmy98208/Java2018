package calArea;

public class MyCircle implements Shape {
	double r;
	public MyCircle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return Math.PI*r*r;
	}
}
