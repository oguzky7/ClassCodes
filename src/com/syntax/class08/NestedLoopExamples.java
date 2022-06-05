package com.syntax.class08;

public class NestedLoopExamples {
	
	public static void main(String[] args) {
		
		for(int a=0; a<=4; a++) {
			
			for (int b=0; b<=3; b++) {
				
				for (int c=0; c<=2; c++) {
					
					System.out.println(a+" "+b+" "+c);
				}
			}
		}
	}
}
