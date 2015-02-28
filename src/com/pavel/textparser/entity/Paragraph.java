package com.pavel.textparser.entity;

import java.util.List;

public class Paragraph implements TextDividable {

    protected List<DividedText> arrayOfSubs;
    private ParagraphSplitter paragraphSplitter;

    public Paragraph(String value){
        this.arrayOfSubs = paragraphSplitter.splitText(value);
    }

    @Override
    public String merge(){
        StringBuilder sb = new StringBuilder();
        for (DividedText x : this.arrayOfSubs){
            sb.append(x.merge());
        }
        return sb.toString();
    }


}
