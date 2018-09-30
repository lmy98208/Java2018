/*
*6.4ʹ��BufferedReader �� BufferedWriter������
*���ļ���ȡ���ݣ�������ļ��С�
*author:19160209
*/
package buf_FileToFile;

import java.io.*;

public class FileToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br=new BufferedReader
					(new FileReader("FileToFileIn.txt"));
			BufferedWriter bw=new BufferedWriter
					(new FileWriter("FileToFileOut.txt"));
			while(br.ready())
			{
				String line=br.readLine();
				bw.write(line);
				bw.newLine();//д��һ�л���
			}
			bw.flush();
			br.close();
			bw.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
