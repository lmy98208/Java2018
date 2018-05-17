package Student0412;

class Student {
	private String name;
	private int age;
	
	Student(){
		name="ÎŞÃûÊÏ";
		age=20;
	}
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	public void setAge(int age){this.age=age;}
	public int getAge(){return age;}
	public boolean isSameAge(Student s){
		if(s.getAge()==this.getAge())
			return true;
		else return false;
	}
}
