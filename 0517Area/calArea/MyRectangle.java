package calArea;

public class MyRectangle implements Shape{
	double width,height;
	public MyRectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public double area()
	{
		return width*height;
	}
}
