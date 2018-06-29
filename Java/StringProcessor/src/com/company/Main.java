package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new StringProcessor();
       
        String inputText=null;
        String inputWord = null;
       
        try {
            inputText = processor.readInputText();
            inputWord = processor.readInputText();
            //System.out.println(inputText + "   " + inputWord);
        } catch(Exception e) {
            e.printStackTrace();
        }
        

        processor.showResults(processor.processText(inputText, inputWord));
    }
}