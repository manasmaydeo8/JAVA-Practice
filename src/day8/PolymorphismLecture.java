package day8;

public class PolymorphismLecture {
	public void Class1(int age) {
		System.out.println("My age is : "+age);
	}

	public void Class1(int a, int b) {
		System.out.println(a + b);
	}

	public void Class1() {
		System.out.println("This is default Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismLecture obj = new PolymorphismLecture();
		obj.Class1();
		obj.Class1(22);
		obj.Class1(11 , 11);

		
	}

}
