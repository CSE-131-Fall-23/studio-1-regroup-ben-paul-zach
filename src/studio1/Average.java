package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value for the first integer to be average:  ");
		int n1 = in.nextInt();
		System.out.println("What is the value of the second integer to be averaged: ");
		int n2 = in.nextInt();
		int average = ((n1 + n2)/2);
		System.out.println("The average of the two integers inputted is: " + average);
	}

}
