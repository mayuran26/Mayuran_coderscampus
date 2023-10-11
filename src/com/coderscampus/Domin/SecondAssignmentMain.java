package com.coderscampus.Domin;

import java.util.Scanner;

public class SecondAssignmentMain {

	public static void main(String[] args) {

		
System.out.println("Enter the Number: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int convertInput = Integer.parseInt(input);
		
		SecondAssignment obj = new SecondAssignment();
		
		obj.enteredNumber(convertInput);		
		
		scanner.close();

	}

}
