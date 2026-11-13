package day7;

interface Lecture1{
	void lect();
}

class Lecture101 implements Lecture1{
	public void lect() {
		System.out.println("this is Interface class");
	}
}
public class interfaceLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture101 obj = new Lecture101();
		obj.lect();
	}

}
