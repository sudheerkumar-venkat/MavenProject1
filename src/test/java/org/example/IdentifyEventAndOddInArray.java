package org.example;

public class IdentifyEventAndOddInArray {

	public static void IdentifyEventAndOddInArray() {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,5,7,4,5};
		int even_count =0, odd_count=0;
		//int value[] = null;
		for(int value:a) {
			if(value%2 == 0) {
				even_count++;
				System.out.println(value+" is a Even Number.");
			}else {
				odd_count++;
				System.out.println(value+" is a Odd Number");
			}
			
		}
		System.out.println("Total Even Number Count: "+even_count+" and Odd Number count: "+odd_count);

	}

}
