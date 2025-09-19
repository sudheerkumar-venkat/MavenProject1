package org.example;

import java.util.Scanner;

public class DigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number where it will give you number of digits: ");
		
		int num = sc.nextInt();
		int original_value =num;
		int count =0;
		
		//counting digits in a number
		while(num>0) {
			
			num =num/10;
			count++;
		}
		System.out.println("Number of digits in "+original_value+" are "+count
				);
	}

}
