package java0419;

class MyPoint {
	private int x;
	private int y;
	MyPoint()
	{
		x=y=0;
	}
	MyPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	float getD(MyPoint temp)
	{
		double xpow=Math.pow(this.x-temp.x, 2);
		double ypow=Math.pow(this.y-temp.y, 2);
		return (float)Math.sqrt(xpow+ypow);
	}

}
