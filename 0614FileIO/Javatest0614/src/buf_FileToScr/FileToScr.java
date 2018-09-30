/*
*6.3使用BufferedReader 和 BufferedWriter做到：
*使用字符流方式，从文件读取数据，输出到屏幕上。
*author:19160209
*/
package buf_FileToScr;

import java.io.*;
public class FileToScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br=new BufferedReader
					(new FileReader("FileToScr.txt"));
			String input=null;
			boolean flag=true;//标记是否继续读下去
			while(flag==true)
			{
				input=br.readLine();
				if(input==null)
					flag=false;
				else System.out.println(input);
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
