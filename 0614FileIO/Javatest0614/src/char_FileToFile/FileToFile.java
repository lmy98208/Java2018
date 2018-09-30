/*
 * 5.使用字符流方式，从文件读取数据，输出到文件中。
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
