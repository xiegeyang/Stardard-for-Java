package com.ids06j.Geyang;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AttackTest {
	static Calendar c = new GregorianCalendar(1995, GregorianCalendar.MAY,23);
	
	public static void main(String[] args){
		String malicios[] = {"%1$tm", "%1$te", "%1$tY"};
		
		System.out.printf(malicios[2] + " did not match! HINT: It was issued on %1$terd of some month.", c);
	}
}
