/*
 *4.使用字符流方式，从文件读取数据，输出到屏幕上。
 *author:19160209
 */

package char_FileToScr;
import java.io.*;
public class FileToScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader
					(new FileInputStream("FileToScr.txt"));
			char c[]=new char[512];
			int n=isr.read(c);
			System.out.println(new String(c,0,n));
		    isr.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
