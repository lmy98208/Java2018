/*
*2.ʹ���ֽ�����ʽ���Ӽ����������ݣ��������Ļ�ϡ�
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
