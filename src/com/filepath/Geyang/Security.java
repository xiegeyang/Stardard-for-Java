package com.filepath.Geyang;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Security {
	private static final String NAME = "Hello.txt";
	private static final String PATH = "Documents\\";
	private static final String FAKENAME = "..\\..\\..\\Logs\\secret.txt";
	

	public static void main(String[] args) {
		File f = new File(System.getProperty("user.home") + System.getProperty("file.separator")
				+ PATH + FAKENAME);
		
		String canPath = new String();
		try {
			canPath = f.getCanonicalPath();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(canPath);
		//if(canPath.equals())
			
		if(!canPath.equals("C:\\Users\\GeyangXie\\Documents\\Hello.txt")){
			System.out.println("Attack detect");
			return;
		}
			
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(canPath);
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
