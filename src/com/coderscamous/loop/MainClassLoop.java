package com.coderscamous.loop;

import java.util.Scanner;

import com.coderscampus.Domin.SecondAssignment;

public class MainClassLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter the Number: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int convertInput = Integer.parseInt(input);
		
		LoopAssignment objLoop = new LoopAssignment();
		
		objLoop.loopAssignment(convertInput);	
		System.out.println("Entered number is : "+convertInput);
		
	}

}
