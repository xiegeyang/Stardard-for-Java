package com.filepermission.Geyang;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.security.Permission;
import java.io.FilePermission;




public class TestFile {
	final static String PATH = "D:\\Documents\\EclipseWorkSpace\\Stardard for Java\\filePermission.txt";
	
	public static void main(String[] args){
		
		
		File f = new File("filePermission.txt");
		try {
			if(f.createNewFile())System.out.println("Success!");
			else System.out.println ("Error, file already exists.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// Allow all types of access to all files
		Permission java.io.FilePermission "D:\\Documents\\EclipseWorkSpace\\Stardard for Java\\filePermission.txt",
		"read,write,delete,execute"; 
		
		f.setReadable(true);
		try {
			FileInputStream(f);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void FileInputStream(File file) throws FileAlreadyExistsException{
		String name = (file != null ? file.getPath() : null);
		System.out.println(name);
		SecurityManager security = new SecurityManager();
	    if (security != null) {
	        security.checkRead(name);
	    }
	    if (name == null) {
	        throw new NullPointerException();
	    }
	    System.out.println("<<DONE>>");
	}
}


