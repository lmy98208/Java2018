package triangle;

public class Triangle {
	private float angle1;
	private float angle2;
	private float angle3;
	Triangle(float a,float b,float c)
	{
		if((a+b>c)&&(a+c>b)&&(c+b)>a)//����֮�ʹ��ڵ����ߣ�����������
		{
			angle1=a;
			angle2=b;
			angle3=c;
		}
		else{//������ȱ�������
			float min=a;
			if(b<min) min=b;
			if(c<min) min=c;
			angle1=angle2=angle3=min;
		}
	}
	double getArea()
	{
		double p=(angle1+angle2+angle3)/2;
		return Math.sqrt(p*(p-angle1)*(p-angle2)*(p-angle3));
	}
	float getAngle1(){return angle1;}
	float getAngle2(){return angle2;}
	float getAngle3(){return angle3;}
}
