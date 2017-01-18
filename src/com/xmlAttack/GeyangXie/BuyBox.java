package com.xmlAttack.GeyangXie;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class BuyBox {
	private static BuyBox instance;
	
	private BuyBox(){}
	
	public static BuyBox getInstance(){
		if(instance == null) instance = new BuyBox();
		return instance;
	}
	
	public void createXMLStream(BufferedOutputStream outStream, String quantity) throws IOException{
		String xmlString;
		xmlString = "<item>\n<description>Widget</description>\n" +
					"<price>500.0</price>\n" +
					"<quantity>" + quantity + "</quantity></item>";
		outStream.write(xmlString.getBytes());
		outStream.flush();
	}
	
	public void createXMLStreamSafe(BufferedOutputStream outStream, String quantity) throws IOException{
		
		if(!Pattern.matches("[0-9] +", quantity)){
			System.out.println("attack detected!");
			quantity = "0";
		}
		String xmlString;
		xmlString = "<item>\n<description>Widget</description>\n" +
					"<price>500.0</price>\n" +
					"<quantity>" + quantity + "</quantity></item>";
		outStream.write(xmlString.getBytes());
		outStream.flush();
	}
}
