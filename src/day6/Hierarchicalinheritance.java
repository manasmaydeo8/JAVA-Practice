
package day6;

class grandfather2 {
	public void grandfather1() {
		System.out.println("this is Grandfather");
	}
}

class father2 extends grandfather {
	public void father1() {
		System.out.println("this is father");
	}
}

class uncles extends grandfather {
	public void uncle1() {
		System.out.println("this is uncle");
	}
}

public class Hierarchicalinheritance {
	public static void main(String[] args) {

		uncles obj1 = new uncles();
		father2 obj2 = new father2();

		obj2.grandfather1();
		obj2.father1();

		obj1.uncle1();
	}
}
