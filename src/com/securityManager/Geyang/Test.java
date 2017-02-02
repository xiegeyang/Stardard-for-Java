package com.securityManager.Geyang;

public class Test {
	public static void main(String[] args){
		PasswordSecurityManager psm = new PasswordSecurityManager("123");
		psm.checkRead("123");
	}
}
