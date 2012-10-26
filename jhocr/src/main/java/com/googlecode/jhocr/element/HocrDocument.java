/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlecode.jhocr.element;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo-moreira
 */
public class HocrDocument {
    
    private String contentType;
    private String ocrSystem;
    
    private List<HocrPage> pages = new ArrayList<HocrPage>();

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getOcrSystem() {
        return ocrSystem;
    }

    public void setOcrSystem(String ocrSystem) {
        this.ocrSystem = ocrSystem;
    }

    public List<HocrPage> getPages() {
        return pages;
    }

    public void setPages(List<HocrPage> pages) {
        this.pages = pages;
    }

    public void addPage(HocrPage page) {
        page.setDocument(this);
        getPages().add(page);
    }

    @Override
    public String toString() {
        return "HocrDocument{" + "contentType=" + contentType + ", ocrSystem=" + ocrSystem + ", pages=" + pages.size() + '}';
    }
}