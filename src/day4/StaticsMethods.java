package day4;

public class StaticsMethods {

	public int Multiplevar(int a) {
		if(a>18) {
			System.out.println("he can vote");
		}else {
			System.out.println("he can't Vote");
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticsMethods demo = new StaticsMethods();
		System.out.println(demo.Multiplevar(22));
	}

}
