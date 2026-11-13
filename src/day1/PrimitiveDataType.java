package day1;

public class PrimitiveDataType {
	public static void main(String[] args) {
		//Primitive data type
		byte a =127;
		short b = 12346;
		int age = 1345678;
		long d = 987654345;
		float e=12.34456764f;
		double f =12.34565434567654567f;
		char g='m';
		boolean h =true;
		System.out.println("this is a integer "+age);
		//Non-primitive data type

		String name="Manas";
		System.out.println(name);
		int[]num = {23,45,67,12,34};
		System.out.println(num[1]);
		String[]names = {"Manas","Pritam","Varsha","Om","Omkar"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}

	}
}
