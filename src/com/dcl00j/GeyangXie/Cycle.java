package com.dcl00j.GeyangXie;

public class Cycle {
	private final int balance;
	private static final Cycle c = new Cycle();
	
	private static final int deposit = (int) (Math.random() *100) + 10;
	
	public Cycle(){
		balance = deposit - 10;
	}
	
	public static void main(String[] args){
		System.out.println("The account balance is : " + c.balance);
	}
}
