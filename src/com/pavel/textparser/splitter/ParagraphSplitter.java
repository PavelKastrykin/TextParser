package com.pavel.textparser.splitter;

import com.pavel.textparser.entity.Sentence;
import com.pavel.textparser.entity.TextDividable;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ParagraphSplitter {

    public List<TextDividable> splitText(String string){
        List<TextDividable> arrayOfSentences = new ArrayList<TextDividable>();
        while (string.length() > 0){
            String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.SENTENCE_END_PATTERN) + 1);
            arrayOfSentences.add(new Sentence(textPart));
            string = string.replaceFirst(Pattern.quote(textPart), "");
        }
        return arrayOfSentences;
    }
}
