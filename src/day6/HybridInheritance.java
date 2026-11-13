package day6;



class grandfather3 {
	public void grandfather1() {
		System.out.println("this is Grandfather");
	}
}

class father3 extends grandfather3 {
	public void father1() {
		System.out.println("this is father");
	}
}

class uncles1 extends grandfather3 {
	public void uncle1() {
		System.out.println("this is uncle");
	}
}

class child3 extends father3 {
	public void child() {
		System.out.println("this is uncle");
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child3 obj5 = new child3();
		uncles1 obj = new uncles1();
		obj.grandfather1();
		obj5.father1();
		
	}

}
