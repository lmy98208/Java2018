/*
 *3.使用字符流方式，从键盘输入数据，输出到屏幕上。
 *author:19160209
 */
package char_KeyToScr;
import java.io.*;

public class KeyToScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]=new char[512];
		int n,i;
		try{
			InputStreamReader isr=new InputStreamReader
					(System.in);
			n=isr.read(c,0,512);
			System.out.println(new String(c,0,n));
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
