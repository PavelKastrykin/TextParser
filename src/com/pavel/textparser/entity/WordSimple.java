package com.pavel.textparser.entity;

import javax.xml.soap.Text;

public class WordSimple implements TextDividable{
    private String wordSimple;

    public WordSimple (String value){
        this.wordSimple = value;
    }

    @Override
    public String merge(){
        return this.wordSimple;
    }
}
