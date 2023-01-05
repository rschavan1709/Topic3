package com.neosoft.throwandthrows;

public class Throws1 {
	public static void main(String[] args) throws Exception {
		
		try {
			System.out.println("1");
			throw new Exception();
		}catch (Exception e) {
			System.out.println("catch");
		}
	}
//	public static void m1() throws Exception  {
//		m2();
//	}
//	public static void m2() throws Exception {
//		m3();
//	}
//	public static void m3() throws Exception {
//		throw new Exception();
//	}
	
}
