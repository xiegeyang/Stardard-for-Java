package com.dcl00j.GeyangXie;

public class SafeCycle {
	private final int balance;
	private static final int deposit = (int ) (Math.random()*100)+10;
	
	private static final SafeCycle c = new SafeCycle();
	
	public SafeCycle(){
		balance = deposit - 10;
	}
	
	public static void main(String[] args){
		System.out.println("The account balance is: " + c.balance);
	}
}
