package Rectangle0412;

class Rectangle {
	private int length;
	private int height;
	Rectangle(int l, int h)
	{
		height=h;
		length=l;
	}
	public int getArea(){
		if((height>=0)&&(height<=50)&&
				(length>=0)&&(length<=50))
			return height*length;
		else return -1;
	}
	public int getPerimeter(){
		return 2*(height+length);
	}
	public void draw()
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(i==0||i==height-1)//��һ�к����һ��ȫ��**
					System.out.print("*");
				else {
					if(j==0||j==length-1)
						System.out.print("*");
					else System.out.print(" ");//�м������д�** ����Ϊ��
						}
			}
			System.out.print("\n");//ÿ����һ�л���
		}
	}
}
