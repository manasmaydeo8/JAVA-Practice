package day2;

import java.util.Scanner;

public class Day2Lec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your City:");
		String name = sc.nextLine();

		System.out.println("Enter your Age:");
		int age = sc.nextInt();

		System.out.println("Enter Do live in that city:");
		boolean bool = sc.nextBoolean();

		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("DO you:" + bool);

		sc.close();
	}
}


