package com.neosoft.trycatchfinally;

public class Exception2 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
