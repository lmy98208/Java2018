/*
*6.3ʹ��BufferedReader �� BufferedWriter������
*ʹ���ַ�����ʽ�����ļ���ȡ���ݣ��������Ļ�ϡ�
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
			boolean flag=true;//����Ƿ��������ȥ
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
