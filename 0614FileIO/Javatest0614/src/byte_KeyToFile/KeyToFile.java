/*
 *1.ʹ���ֽ�����ʽ���Ӽ����������ݣ�������ļ��С�
 *author:19160209
 */

package byte_KeyToFile;

import java.io.*;
public class KeyToFile {
	public static void main(String[] args) {
		//char c[]=new char[512];
		byte b[]=new byte[512];
		try{
			FileOutputStream wf=new FileOutputStream("KeyToFile.txt");
			int n=System.in.read(b);
			/*for(int i=0;i<n;i++)
				c[i]=(char)b[i];*/
			wf.write(b);//ʹ��char��cʱ����
			wf.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
