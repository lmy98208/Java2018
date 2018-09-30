/*
*6.4使用BufferedReader 和 BufferedWriter做到：
*从文件读取数据，输出到文件中。
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
				bw.newLine();//写完一行换行
			}
			bw.flush();
			br.close();
			bw.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
