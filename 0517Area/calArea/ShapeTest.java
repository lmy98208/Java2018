package calArea;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes=new Shape[3];
		shapes[0]=new MyCircle(10);
		shapes[1]=new MyRectangle(5,10);
		shapes[2]=new MyTriangle(5,12,13);
		Shape shape;
		for(int i=0;i<3;i++)
		{
			shape=shapes[i];
			System.out.println(
					(i+1)+":面积"+
					String.format("%1$.2f", shape.area())//两位小数输出
					);
		}
	}

}
