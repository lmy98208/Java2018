package test0524_1;

public class TestStatisticsWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[6];
		s[0]="nor";
		s[1]="word";
		s[2]="forward";
		s[3]="whatever";
		s[4]="when";
		s[5]="what";
		int len=s.length;
		StatisticsWord sta=new StatisticsWord();
		System.out.println("����ĸw��ͷ�ĵ�����:"+sta.BeginWithW(s,len));
		System.out.println("�����к�or�ַ����ĵ�����:"+sta.OrNumber(s, len));
		System.out.println("����Ϊ3�ĵ�����:"+sta.LenEqual3(s, len));
	}

}
