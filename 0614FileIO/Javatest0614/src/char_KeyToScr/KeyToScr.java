/*
 *3.ʹ���ַ�����ʽ���Ӽ����������ݣ��������Ļ�ϡ�
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
