package test0524_1;

public class StatisticsWord {
	public int BeginWithW(String[] str,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
			if(str[i].charAt(0)=='w')
				count++;	
		return count;
	}
	public int OrNumber(String[] str,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
			if(str[i].indexOf("or")>-1)
				count++;
		return count;
	}
	public int LenEqual3(String[] str,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
			if(str[i].length()==3)
				count++;
		return count;
	}
}
