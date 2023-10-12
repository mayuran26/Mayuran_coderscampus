package com.coderscampus.ThiredAssignment;

import java.util.Scanner;

public class CompoundingIntrest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String investmentInput = collectInput(scanner, "Type in your starting investment: ");
		
		String interestInput = collectInput(scanner, "Type in your interest rate: ");
		
		//System.out.println("Type in your interest rate: ");
		//String interest = scanner.nextLine();
		
		//System.out.println(investment);
		
		double investmentInputConv = Integer.parseInt(investmentInput);
		double interestInputConv = Double.parseDouble(interestInput);
		//System.out.println(investmentInput);
		//System.out.println(interestInput);
		
		for(int j =0;j<=5;j++) {
		double amount = compoundingInterest(investmentInputConv, interestInputConv, j);
		investmentInputConv= amount;
		}
		//System.out.println(amount);
		
		scanner.close();
		
		
		
		
	}

	private static String collectInput(Scanner scanner, String message) {
		System.out.println(message);
		
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	private static double compoundingInterest(double invIn, double interIn, int index) {
		
		for(int i=0;i<5; i++) {
		
		invIn = invIn * (interIn+ 1.0);
		}
		System.out.println("After "+((index*5)+5)+ " years, you would have: "+Math.round(invIn));
		return invIn;
		
		
	}

}
