package com.xmlAttack.GeyangXie;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


public class StaXParser {
     static final String ITEM = "item";
     static final String DESCRIPTION = "description";
     static final String PRICE = "price";
     static final String QUANTITY = "quantity";
     

     @SuppressWarnings({ "unchecked", "null" })
     public List<Item> readConfig(String configFile) {
    	 
             List<Item> items = new ArrayList<Item>();
             try {
                     // First, create a new XMLInputFactory
                     XMLInputFactory inputFactory = XMLInputFactory.newInstance();
                     // Setup a new eventReader
                     InputStream in = new FileInputStream(configFile);
                     XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
                     // read the XML document
                     Item item = null;

                     while (eventReader.hasNext()) {
                             XMLEvent event = eventReader.nextEvent();

                             if (event.isStartElement()) {
                                     StartElement startElement = event.asStartElement();
                                     // If we have an item element, we create a new item
                                     if (startElement.getName().getLocalPart().equals(ITEM)) {
                                             item = new Item();
                                             // We read the attributes from this tag and add the date
                                             // attribute to our object
                                     }

                                     if (event.isStartElement()) {
                                             if (event.asStartElement().getName().getLocalPart()
                                                             .equals(DESCRIPTION)) {
                                                     event = eventReader.nextEvent();
                                                     item.setDescription(event.asCharacters().getData());
                                                     continue;
                                             }
                                     }
                                     if (event.asStartElement().getName().getLocalPart()
                                                     .equals(PRICE)) {
                                             event = eventReader.nextEvent();
                                             item.setPrice(Double.valueOf(event.asCharacters().getData()));
                                             continue;
                                     }

                                     if (event.asStartElement().getName().getLocalPart()
                                                     .equals(QUANTITY)) {
                                             event = eventReader.nextEvent();
                                             item.setQuantity(event.asCharacters().getData());
                                             continue;
                                     }
                             }
                             // If we reach the end of an item element, we add it to the list
                             if (event.isEndElement()) {
                                     EndElement endElement = event.asEndElement();
                                     if (endElement.getName().getLocalPart().equals(ITEM)) {
                                             items.add(item);
                                     }
                             }

                     }
             } catch (FileNotFoundException e) {
                     e.printStackTrace();
             } catch (XMLStreamException e) {
                     e.printStackTrace();
             }
             return items;
     }

}

