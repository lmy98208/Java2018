/*
 * 5.ʹ���ַ�����ʽ�����ļ���ȡ���ݣ�������ļ��С�
 * author:19160209
 */
package char_FileToFile;
import java.io.*;
public class FileToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InputStreamReader isr=new InputStreamReader
					(new FileInputStream("FileToFileIn.txt"));
			OutputStreamWriter osr=new OutputStreamWriter
					(new FileOutputStream("FileToFileOut.txt"));
			BufferedReader br = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(osr);
			String line;
			while((line=br.readLine())!=null)
			{
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
