package com.neosoft.trywithresource;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithResource {
	public static void main(String args[]){      
	        // Using try-with-resources  
	try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
	String msg = "Welcome to Neosoft !";      
	byte byteArray[] = msg.getBytes(); //converting string into byte array      
	fileOutputStream.write(byteArray);  
	System.out.println("Message written to file successfuly!");      
	}
	catch(Exception exception){  
	       System.out.println(exception);  
	}      
	
	try (Scanner sc=new Scanner(System.in)){
		int a=sc.nextInt();
		System.out.println("Hello");
	} 
	}      
}    
