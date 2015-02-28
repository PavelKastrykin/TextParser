package com.pavel.textparser.entity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManager {

    public String textToWork;


    public TextManager() throws IOException{
    }

    public void readFile(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append(reader.readLine()).append("\n");
        }
        textToWork = sb.toString();

    }

    public void replaceSpaceEnter(){
        textToWork = textToWork.replaceAll(" \n", "\n");
    }

    public void splitText(){
        String regex = "[0-9|A-Z]{1}[[\\w|,|']*| ]*[.!?:\n]";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(textToWork);
        while (m1.find()){
            String s=m1.group();
            //sentence.add(new Sentence(s));
            System.out.println(s);
        }
    }

}
