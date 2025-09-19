package org.example;

import java.util.Scanner;

public class FinbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print finboncci series for 1st 20 numbers
		//0,1,1,2,3,5,8,13,21....
		//sum of two previous numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Finboncci number: ");
		int n = sc.nextInt();
		int a=0, b=1;
		System.out.print(a+","+b+",");
		for(int i=1;i<=n;i++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+",");
		}

	}

}
