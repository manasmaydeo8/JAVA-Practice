package day6;

class grandfather {
	public void grandfather1() {
		System.out.println("this is Grandfather");
	}
}

class father extends grandfather {
	public void father1() {
		System.out.println("this is father");
	}
}

class child extends father {
	public void child1() {
		System.out.println("this is child");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
		obj.grandfather1();
		obj.father1();
		obj.child1();
	}

}
