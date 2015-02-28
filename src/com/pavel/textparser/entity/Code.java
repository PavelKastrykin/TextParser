package com.pavel.textparser.entity;

public class Code implements TextDividable{

    private String codeValue;

    public Code (String value){
        this.codeValue = value;
    }

    @Override
    public String merge() {
        return codeValue;
    }
}
