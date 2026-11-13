package iTvedantJavalect;

import java.util.Scanner;

public class SwitchOrCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your day:");
		int day = sc.nextInt();

		switch (day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Invalid day");
			break;
		}
		sc.close();
	}

}
