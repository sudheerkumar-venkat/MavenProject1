package org.example;

public class AddedNewClass {

	public static void NoWords(){
		// TODO Auto-generated method stub
		
		String str = "Welcome to Java and Selenium World";
		int count=1;
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i) == ' '&&str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("No. of words: "+count);

	}

}
