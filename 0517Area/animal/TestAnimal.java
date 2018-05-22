package animal;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Bird("麻雀",2,1.2f);//向上转型
		animal.showInfo();
		animal.move();
		animal.eat();
	}

}
