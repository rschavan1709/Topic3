package com.neosoft.trycatchfinally;

public class Exception4 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			int i=10/0;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
