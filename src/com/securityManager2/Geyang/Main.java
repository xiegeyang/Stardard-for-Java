package com.securityManager2.Geyang;
import java.io.FileDescriptor;
/* w ww  .j  a v  a2 s. co  m*/
public class Main extends SecurityManager {

   public static void main(String[] args) {
      System.setProperty("java.security.policy", "file:/D:/Documents/EclipseWorkSpace/Stardard for Java/java.policy");

      Main sm = new Main();

      System.setSecurityManager(sm);

      sm.checkRead("filePermission.txt");

      System.out.println("Allowed!");
   }
}