package dev.lpa;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWords = (sentence ->{
           String[] parts = sentence.split(" ");
           for(String part : parts){
               System.out.println(part);
           }
        });

    }
}