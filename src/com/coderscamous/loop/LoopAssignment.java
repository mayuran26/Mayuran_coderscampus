package com.coderscamous.loop;

public class LoopAssignment {
	

	
	int loopAssignment(int getNumber) 
	{
		
		if (getNumber >= 50 && getNumber <= 300)
		{
		
		for(int i =50;i<= getNumber;i++) 
		 	{
			//System.out.println(i);
			//enteredNumber = enteredNumber +i;
			System.out.println(i);
		 	}  
		//System.out.println(i);
		}
		
		else {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
		}
		
		return getNumber;
		
	}

	

}

//	