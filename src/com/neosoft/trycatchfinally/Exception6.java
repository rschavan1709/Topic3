package com.neosoft.trycatchfinally;

public class Exception6 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			int i=10;
		} catch (NullPointerException e) {
			int a=10/0;
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("end");
	}
}
