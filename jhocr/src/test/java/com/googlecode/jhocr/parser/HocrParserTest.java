package com.googlecode.jhocr.parser;

import java.io.InputStream;

import junit.framework.TestCase;

import com.googlecode.jhocr.element.HocrCarea;
import com.googlecode.jhocr.element.HocrDocument;
import com.googlecode.jhocr.element.HocrLine;
import com.googlecode.jhocr.element.HocrPage;
import com.googlecode.jhocr.element.HocrParagraph;
import com.googlecode.jhocr.element.HocrWord;


public class HocrParserTest extends TestCase {

    public void testParser() throws Exception {

    	InputStream hocrInputStream = this.getClass().getResourceAsStream("../phototest.tif.html");
        
        HocrParser parser = new HocrParser(hocrInputStream);

        HocrDocument document = parser.parse();
        
        System.out.println(document);
        
        String pre = "-- ";
        
        for (HocrPage page : document.getPages()) {
            System.out.println(pre + page);
            for (HocrCarea carea : page.getCareas()) {
                System.out.println(pre + pre + carea);
                for (HocrParagraph paragraph : carea.getParagraphs()) {
                    System.out.println(pre +pre + pre + paragraph);
                    for (HocrLine line : paragraph.getLines()) {
                       System.out.println(pre +pre + pre + pre + line);
                       for (HocrWord word : line.getWords()) {
                           System.out.println(pre +pre + pre + pre + pre + word);
                       }
                    }
                }
            }
        }
        
        assertTrue( true );
    }
}
