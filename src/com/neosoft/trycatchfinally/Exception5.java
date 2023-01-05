package com.neosoft.trycatchfinally;

public class Exception5 {
	public static void main(String[] args) {
		System.out.println(m1());
		System.out.println(m2());
	}
	public static int m1() {
		try {
			System.out.println("Try");
			int i=10;
			//System.exit(0);
			return i;
		} catch (Exception e) {
			System.out.println("Catch");
			return 0;
		}
		finally {
			System.out.println("Finally");
		}	
	}
	
	public static int m2() {
		try {
			System.out.println("Try");
			int i=10/0;
			return 777;
		} catch (Exception e) {
			System.out.println("Catch");
			return 888;
		}
		finally {
			System.out.println("Finally");
			return 999;
		}	
	}
}
