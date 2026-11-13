package day8;

class Class1 {
	void Lecture() {
		System.out.println("Class 1 ");
	}
}

class Class2 extends Class1 {
	@Override
	void Lecture() {
		super.Lecture();
		System.out.println("Class 2 ");
	}
}

public class OrverridingLecture {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c = new Class2();
		c.Lecture();
	}

}
