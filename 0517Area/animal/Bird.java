package animal;

public class Bird extends Animal{
	Bird(String n,int a,float w)
	{
		name=n;
		age=a;
		weight=w;
	}
	public void showInfo()
	{
		System.out.println("������"+name+
				"\t���䣺"+age+"\t������"+weight);
	}
	public void move()
	{
		System.out.println("�˶���ʽ������");
	}
	public void eat()
	{
		System.out.println("ϲ���Ե�ʳ�����");
	}
}
