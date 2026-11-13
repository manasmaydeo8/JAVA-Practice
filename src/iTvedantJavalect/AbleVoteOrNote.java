package iTvedantJavalect;

import java.util.Scanner;

public class AbleVoteOrNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		if(age>= 18) {
			System.out.println("He can Vote");
		} else {
			System.out.println("He can not Vote");
		}
		sc.close();
	}

}
