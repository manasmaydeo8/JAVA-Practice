package day7;

abstract class abstractlecture {
	abstract void getdemo();

	public void maindemo() {
		System.out.println("this is not a abstract class");
	}
}

class Lectutres extends abstractlecture {
	public void getdemo() {
		System.out.println("This is abstract class");
	}
}

public class AbstractionLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lectutres obj = new Lectutres();
		obj.maindemo();
		obj.getdemo();
	}

}
