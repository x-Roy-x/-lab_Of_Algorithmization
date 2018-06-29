package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String readInputText() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String:");
        return br.readLine();
    }

    public String processText(String inputText, String inputWord){
        Pattern pattern = Pattern.compile("((?U)\\w?"+ inputWord +"\\w?)((.png)|(.jpeg)|(.gif)|(.jpg))");
        Matcher matcher = pattern.matcher(inputText);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()){
            String subStr = inputText.substring(matcher.start(), matcher.end());
            String temp = subStr.trim();

            sb.append(temp + ", ");
        }

        return sb.toString();
    }

    public void showResults(String resultText){
        System.out.println(resultText);
    }
}