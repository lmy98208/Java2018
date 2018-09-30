package buf_KeyToFile;
import java.io.*;
public class KeyToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader br=new BufferedReader
					(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter
					(new FileWriter("KeyToFile.txt"));
			String line=br.readLine();
			bw.write(line);
			br.close();
			bw.close();
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
