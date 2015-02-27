package com.Pavel.TextParser.entity;

public class Paragraph extends DividedText{

    private String content;

    public Paragraph(String value){
        this.content = value;
    }

    public String getStringValue() {
        return this.content;
    }
}
