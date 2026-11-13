package day4;

public class Functionlecture {
	public void showdata() {
		System.out.println("this is a showdata function");
	}

	public void addvar(String name, int b) {
		System.out.println("my name is  " + name + " and my age is " + b);
	}

	public static void main(String[] args) {
		Functionlecture obj = new Functionlecture();
		obj.showdata();
		obj.addvar("Manas", 22);
	}

}
