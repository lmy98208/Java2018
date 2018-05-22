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
		System.out.println("鸟名："+name+
				"\t年龄："+age+"\t质量："+weight);
	}
	public void move()
	{
		System.out.println("运动方式：飞行");
	}
	public void eat()
	{
		System.out.println("喜欢吃的食物：虫子");
	}
}
