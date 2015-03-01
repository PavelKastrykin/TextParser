package com.pavel.textparser.entity;

import com.pavel.textparser.splitter.WordSplitter;

import java.util.List;

public class WordComplicated implements TextDividable{
    protected List<TextDividable> arrayOfSubs;
    private WordSplitter wordSplitter = new WordSplitter();

    public WordComplicated (String value){
        this.arrayOfSubs = wordSplitter.splitText(value);
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
