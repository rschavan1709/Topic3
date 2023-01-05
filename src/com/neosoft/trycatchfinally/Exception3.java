package com.neosoft.trycatchfinally;

public class Exception3 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			int i=10/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
