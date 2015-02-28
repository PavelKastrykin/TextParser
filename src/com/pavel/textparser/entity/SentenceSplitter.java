package com.pavel.textparser.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SentenceSplitter {
    private List<String> sentenceSplitted = new ArrayList<String>();

    public List<String> getSentenceSplitted(){
        return this.sentenceSplitted;
    }

    public void splitText(String string){
        while (string.length() > 0){
            String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.WORD_END_PATTERN) + 1);
            sentenceSplitted.add(textPart);
            string = string.replaceFirst(Pattern.quote(textPart), "");
        }
    }
}
