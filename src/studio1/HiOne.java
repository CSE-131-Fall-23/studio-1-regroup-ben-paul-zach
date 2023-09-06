package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		System.out.printf("Hello " + name + ". How are you?");

	}

}
