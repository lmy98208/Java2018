package triangle;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri=new Triangle(1.3f,2.1f,3.9f);
		System.out.println("The area of the triangle"
				+ "("+tri.getAngle1()+","
				+tri.getAngle2()+","
				+tri.getAngle3()+","+"):"
				+String.format("%1$.2f", tri.getArea())//两位小数输出
				);
	}

}
