//package com.pavel.textparser.entity;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class ParagraphSplitter {
//
//    public List<TextDividable> splitText(String string){
//        List<TextDividable> arrayOfSentences = new ArrayList<TextDividable>();
//        while (string.length() > 0){
//            String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.SENTENCE_END_PATTERN) + 2);
//            arrayOfSentences.add(new Sentence(textPart));
//            string = string.replaceFirst(Pattern.quote(textPart), "");
//        }
//        return arrayOfSentences;
//    }
//}
