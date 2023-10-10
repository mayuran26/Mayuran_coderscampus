package com.coderscampus.Domin;

public class SecondAssignment {
	
	int convertInput;
	
	int enteredNumber(int convertInput) {
		if (convertInput >= 50 && convertInput <=300) {
	
			 System.out.println("Entered Number is : "+convertInput);
			 this.convertInput = convertInput;
			  return convertInput;
		}
		else {
			
			System.out.println("Entered Number is : ");
			return 0;
			
		}
		
	}

}
