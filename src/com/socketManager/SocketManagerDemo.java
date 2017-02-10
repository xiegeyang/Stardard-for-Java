package com.socketManager;

public class SocketManagerDemo {

	   public static void main(String[] args) {

	   // set the policy file as the system securuty policy
	   System.setProperty("java.security.policy", "java.policy");

	   // create a security manager
	   SecurityManager sm = new SecurityManager();

	   // set the system security manager
	   System.setSecurityManager(sm);

	   // check if accepting socket connection is enabled
	   sm.checkAccept("www.tutorialspoint.com", 8080);

	   // print a message if we passed the check
	   System.out.println("Allowed!");
	   }
	}
