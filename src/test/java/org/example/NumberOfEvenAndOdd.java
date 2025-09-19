package org.example;

import java.util.Scanner;

public class NumberOfEvenAndOdd {

	public static void NumberOfEvenAndOdd() {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find even and odd count: ");
		int num = sc.nextInt();
		
		int original_value = num;
		int even_count=0,odd_count =0;
		
		//no of even and odd count for the given number
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
				//System.out.println("Even numbers: "+num);
			}else {
				odd_count++;
				//System.out.println("Odd numbers: "+num);
			}
			num=num/10;
		}
		
		System.out.println("Even count: "+even_count);
		System.out.println("odd count: "+odd_count);
	}
	
	

}
