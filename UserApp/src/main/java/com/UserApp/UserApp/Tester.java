package com.UserApp.UserApp;

import java.util.HashSet;

public class Tester {
	
	private String a;
	private int b ;
	
	
	
	
	
	
	public Tester(String a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	
	
	
	
	
	





	public String getA() {
		return a;
	}












	public void setA(String a) {
		this.a = a;
	}












	public int getB() {
		return b;
	}












	public void setB(int b) {
		this.b = b;
	}












	public static void main (String[] args) {
		Tester a1 = new Tester("abc",1);
		Tester a2 = new Tester("abc",1);
		
		HashSet a = new HashSet<>();
		
		a.add(a1);
		a.add(a2);
		
		System.out.println(a.size());
		
	}
	
	
	
	
	

}
