package com.neosoft.trycatchfinally;

public class Exception1 {
	public static void main(String[] args) {
		try {
			int i=10/0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}
}
