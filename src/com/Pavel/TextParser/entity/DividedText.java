package com.Pavel.TextParser.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class DividedText {
    protected String getStringValue(){
        return this.merge();
    }

    protected List<DividedText> arrayOfSubs = new ArrayList<DividedText>();

    public String merge(){
        StringBuilder sb = new StringBuilder();
        for (DividedText x : arrayOfSubs){
            sb.append(x.getStringValue());
        }
        return sb.toString();
    }

}
