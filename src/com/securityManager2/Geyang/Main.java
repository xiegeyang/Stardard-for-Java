package com.securityManager2.Geyang;
import java.io.FileDescriptor;


/*
 * 1.Create a txt file in your project folder
 * 2.Right click the file and click edit, copy and past the code below in the file
 * grant {
	  permission java.lang.RuntimePermission "setSecurityManager";
	  permission java.lang.RuntimePermission "createSecurityManager";
	  permission java.lang.RuntimePermission "usePolicy";
	  
	};
 * 3.Save and rename the file to 'java.policy'
 * 4.run the program
 * 5.Right clock the file and click edit, 
 * 6.Delete the last permission : 'permission java.security.AllPermission;' and run the program
 */
public class Main extends SecurityManager {

   public static void main(String[] args) {
      System.setProperty("java.security.policy", "java.policy");

      Main sm = new Main();

      System.setSecurityManager(sm);

      sm.checkRead("filePermission.txt");

      System.out.println("Allowed!");
   }
}