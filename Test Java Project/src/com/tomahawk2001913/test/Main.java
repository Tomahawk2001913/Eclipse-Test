package com.tomahawk2001913.test;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello World!");
		
		int ans = 0;
		
		Scanner scan = new Scanner(System.in);
		
		ans = scan.nextInt() + scan.nextInt();
		
		System.out.println(ans);
	}
}