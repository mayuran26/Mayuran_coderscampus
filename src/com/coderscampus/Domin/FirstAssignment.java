package com.coderscampus.Domin;

import java.util.Scanner;

public class FirstAssignment {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int convertInput = Integer.parseInt(input);
		
		if (convertInput >= 50 && convertInput <=300) {
			System.out.println("Yes!");
		}
		else {
			System.out.println("No!");
		}
		scanner.close();
	}

}


//String input = scanner.nextLine();

//Integer convertedInput = Integer.parseInt(input);