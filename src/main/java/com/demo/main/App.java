package com.demo.main;

public class App {

	public static void main(String[] args) {
		for(int i=10;i<=10;i++) {
			System.out.println("PRINT: " + i);
			
			try {
				Thread.sleep(2);
			} catch(Exception e) {
				
			}
		}

	}

}
