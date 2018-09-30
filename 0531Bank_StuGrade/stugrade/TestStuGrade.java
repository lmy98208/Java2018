package stugrade;
import java.util.Scanner;

public class TestStuGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		StuGrade s[]=new StuGrade[10];
		int cnt=0;
		int i=0;
		while(cnt<10&&scanner.hasNext()){
			try{
				s[i]=new StuGrade
						(Integer.parseInt(scanner.nextLine()));
			}catch(Exception e){
				System.out.println("请输入成绩");
				continue;
			}
			cnt++;
			i++;
		}
		try
		{
			if(cnt<10)
				throw new IllegalDataType("请输入至少10个成绩");
			
			else{
				for(int k=0;k<9;k++)
				for(int j=0;j<9;j++)
					if(s[j].GetGrade()<s[j+1].GetGrade())
					{
						int temp=s[j].GetGrade();
						//s[j].GetGrade()=s[j+1].GetGrade();;
						s[j]=new StuGrade(s[j+1].GetGrade());
						s[j+1]=new StuGrade(temp);
					}
				System.out.println("排序后：");
				for(int k=0;k<10;k++)
					s[k].PrintGrade();
			}
		}catch(IllegalDataType e){
			System.out.println(e.getMessage());
		}
	}
}


