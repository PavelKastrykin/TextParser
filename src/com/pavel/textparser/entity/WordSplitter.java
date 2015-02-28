package com.pavel.textparser.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class WordSplitter {
    private List<String> wordSplitted = new ArrayList<String>();

    public List<String> getWordSplitted(){
        return this.wordSplitted;
    }

    public void splitText(String string){
        while (string.length() > 0){
            String textPart = string.substring(0, RegExp.matcherLastPatternIndex(string, RegExp.SIMPLE_WORD_END_PATTERN) + 1);
            wordSplitted.add(textPart);
            string = string.replaceFirst(Pattern.quote(textPart), "");
            if (string.length() > 0){
                wordSplitted.add(string);
            }
        }
    }
}
