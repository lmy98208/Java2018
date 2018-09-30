/*
*2.使用字节流方式，从键盘输入数据，输出到屏幕上。
*author:19160209
*/
package byte_KeyToScr;
import java.io.IOException;

public class KeyToScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[512];
		try{
			int n=System.in.read(b);
			for(int i=0;i<n;i++)
				System.out.print((char)b[i]);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

}
