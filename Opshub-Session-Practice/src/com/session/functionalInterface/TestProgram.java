package com.session.functionalInterface;

public class TestProgram {
	public static void main(String[] args) {
		myInterface mi1 = (a,b)->a+b;
		
		myInterface mi2 = (a,b)->a-b;
		
		System.out.println(mi1.getSum(10, 20));
		System.out.println(mi2.getSum(10, 20));
		myInterface.printMyMethod();
	}
}
