package com.pavel.textparser.entity;

import com.pavel.textparser.splitter.ParagraphSplitter;

import java.util.List;

public class Paragraph implements TextDividable {

    protected List<TextDividable> arrayOfSubs;
    private ParagraphSplitter paragraphSplitter = new ParagraphSplitter();

    public Paragraph(String value){
        this.arrayOfSubs = paragraphSplitter.splitText(value);
    }

    @Override
    public String merge(){
        StringBuilder sb = new StringBuilder();
        for (TextDividable x : this.arrayOfSubs){
            sb.append(x.merge());
        }
        return sb.toString();
    }


}
