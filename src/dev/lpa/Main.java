package dev.lpa;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printWords = (sentence ->{
           String[] parts = sentence.split(" ");
           for(String part : parts){
               System.out.println(part);
           }
        });

        Consumer<String> printWordsForEach = (sentence ->{
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s ->System.out.println(s));
        });

        printWordsForEach.accept("Let's split this up into an array");


        Consumer<String> printWordsConcise = (sentence ->{
          Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        });

        printWordsConcise.accept("Let's split this up into an array");


         UnaryOperator<String> everySecondChar = (source ->{
            StringBuilder returnVal = new StringBuilder();
            for(int i=0; i< source.length(); i++){
                if(i %2 ==1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        });

         String mySol = everySecondChar.apply("1234567890");
         System.out.println(mySol);

         String myThingy = everySecondCharacter(everySecondChar, "1234567890");
System.out.println(myThingy);
    }

    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }

}