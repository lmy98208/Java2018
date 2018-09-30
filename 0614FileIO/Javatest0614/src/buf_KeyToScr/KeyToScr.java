/*
 * 6.1 使用BufferedReader 和 BufferedWriter做到：
 * 从键盘输入一行数据，输出到屏幕上
 * author:19160209
 */
package buf_KeyToScr;

import java.io.*;

public class KeyToScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br=new BufferedReader
				(new InputStreamReader(System.in));
			String input=null;
			while((input=br.readLine())!="\n")
				System.out.println(input);
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
