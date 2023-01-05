package com.neosoft.throwandthrows;

import java.util.Scanner;

public class Throw1 {
	public static void main(String[] args) throws NotEligible {
		System.out.println("Enter a age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			throw new NotEligible("You have to wait for "+(18-age)+" years");
		}
		else {
			System.out.println("You are eligible for vote....");
		}
	}
}
