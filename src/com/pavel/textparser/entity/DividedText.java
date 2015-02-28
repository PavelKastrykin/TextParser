package com.pavel.textparser.entity;

import java.util.List;

public class DividedText implements TextDividable {

    private TextSplitter textSplitter = new TextSplitter();
    protected List<TextDividable> arrayOfSubs;

    public DividedText(String value){
        this.arrayOfSubs = textSplitter.splitText(value);
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
