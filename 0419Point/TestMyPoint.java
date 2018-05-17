package java0419;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint mp1=new MyPoint(2,3);
		MyPoint mp2=new MyPoint(4,5);
		System.out.println("点（2，3）到点（4，5）的距离为："+mp1.getD(mp2));
	}

}
