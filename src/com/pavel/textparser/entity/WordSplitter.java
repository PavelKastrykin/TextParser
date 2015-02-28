package com.pavel.textparser.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSplitter {
    private List<String> wordSplitted = new ArrayList<String>();

    public List<String> getWordSplitted(){
        return this.wordSplitted;
    }

    public void splitText(String string){
        while (string.length() > 0){
            if(!string.matches("^[a-zA-Z].*$")){
                wordSplitted.add(string.substring(0,1));
                string = string.substring(1, string.length());
                continue;
            }
            Pattern pattern = Pattern.compile(RegExp.SIMPLE_WORD_MATCH_PATTERN);
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()){
                String textPart = string.substring(0, matcher.end());
                wordSplitted.add(textPart);
                string = string.replaceFirst(Pattern.quote(textPart), "");
            }

        }
    }
}
