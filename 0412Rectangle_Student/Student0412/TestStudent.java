package Student0412;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		System.out.println("Name:"+stu.getName());
		System.out.println("Age:"+stu.getAge());//������������������
		stu.setAge(15);
		stu.setName("Jack");
		System.out.println("Updated Name:"+stu.getName());//�޸�֮�����������
		System.out.println("Updated Age:"+stu.getAge());
		Student stu2=new Student();
		stu2.setAge(25);
		System.out.print("stu's Age:"+stu.getAge()//����ʵ��������
		+"\tstu2's Age:"+stu2.getAge());
		if(stu.isSameAge(stu2)==true)
			System.out.print("\tsame");
		else System.out.print("\tdifferent");//����ʵ��������ıȽϽ��
	}

}
