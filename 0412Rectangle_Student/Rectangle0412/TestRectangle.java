package Rectangle0412;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle(5,4);
		int temp=rect.getArea();
		if(temp<0) System.out.println("Area:长或高不合法");
		else System.out.println("Area:"+temp);
		System.out.println("Perimeter:"+rect.getPerimeter());
		rect.draw();
	}

}
