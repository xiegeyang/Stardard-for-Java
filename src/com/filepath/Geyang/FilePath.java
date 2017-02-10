package com.filepath.Geyang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * 1. In your project folder,Create a new txt file named Hello.txt
 * 2. Create another secret file named 'secret.txt' outside of the project folder one layer
 * 3. The file path should be NAME
 * 4. The malicious path should be FAKENAME
 */

public class FilePath {
	private static final String NAME = "Hello.txt";
	private static final String FAKENAME = "..\\secret.txt";
	private static final String FILENAME = FAKENAME;

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

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
