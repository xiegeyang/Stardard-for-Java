package com.filepath.Geyang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

/*
 * 1. Create a txt file named 'Hello.txt' in your project folder
 * 2. Go to C://, double-clike 'Logs' folder, Create a txt file named 'security.txt'
 * 3. The file path should be PATH + NAME
 * 4. The malicious path should be PATH + FAKENAME
 */

public class SecureFile {

	private static final String NAME = "Hello.txt";
	private static final String PATH = "Documents\\";
	private static final String FAKENAME = "..\\..\\..\\Logs\\security.txt";
	

	public static void main(String[] args) {
		File f = new File(System.getProperty("user.home") + System.getProperty("file.separator")
				+ PATH + FAKENAME);
		String absPath = f.getAbsolutePath();
		
		
		System.out.println(absPath);
		
		//if(canPath.equals())
			
		
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(absPath);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(fr);

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}

}
